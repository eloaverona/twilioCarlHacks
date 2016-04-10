package com.twilio;

import java.util.HashMap;


/**
 * Created by CarlHacks Team.
 */

public class StoryMaker {

    private HashMap<Integer, Node> mapFromIntToNode;
	private Player player;



	public StoryMaker(Player player) {
		this.player = player;


		// Here we create nodes and graph data Structure
		TrialNodeTest testNodes = new TrialNodeTest();
		this.mapFromIntToNode = testNodes.getMapFromIntToNode();
	}




    public String makeResponse(String message) {

		String response = "You have entered an invalid command. Please try again. "; // default response is the invalid user input response.
		if(player.historySize() == 0){ // If player has just begun game.

			player.addToHistory(0);
			response = "Hello and welcome. This is a text adventure game where you will be given some descriptive text from which you can decide how you want to respond. " +
					"There may be some areas or actions that you may not be able to complete at certain points in the story, but you may be able to complete them later on. " +
					"There may also be times when your actions are not immediate. " +
					"That being said, have fun and let the game begin! Reply yeah! to start!";
			return response;
		}
		if (player.historySize() == 1) { // Player is now ready to start game.
			if(message == "sudo") player.setSudo(true);
			message = "a";

		}
		Node currentNode = getCurrentNode();


		if (message == null) return response + currentNode.getText(); // If player writes a blank message

		message = message.toLowerCase();
		//if(player.isSudo()){
			if(message.equals("boar")){
				currentNode = mapFromIntToNode.get(8);
				player.addToHistory(currentNode.getIdentifier());

			}
		if(message.equals("cellar")){
			currentNode = mapFromIntToNode.get(4);
			player.addToHistory(currentNode.getIdentifier());

		}
		if(message.equals("odin")){
			currentNode = mapFromIntToNode.get(10);
			player.addToHistory(currentNode.getIdentifier());

		}
		//}

		Node nextNode = currentNode.whatNext(message); // Add FailSafe to tell user if they have an invalid command


		if (nextNode == null) {  // If user didn't enter a valid command
			return response + currentNode.getText(); // Give error message + Text of last node.
		}

		// Return the node the player tried to go to. Storymaker asks what do you need. Node says I need the key. Check player for the key. If player has key,
		// Allow player to go to that node. else make player go back to currentNode.
		String altMessage = "";
		if (nextNode.getObjectNeeded() != null ) { // If node needs an object
			if (!player.getObjects().contains(nextNode.getObjectNeeded())) { // If player doesn't have object needed.
				nextNode = mapFromIntToNode.get(nextNode.getAltNodeID());

				altMessage = nextNode.getText() + " ";
				if(nextNode.isDeath()){

					player.clearHistory();
					return altMessage;
				}
				nextNode = currentNode;

			}
		}

        response = nextNode.getText();
		player.addToHistory(nextNode.getIdentifier());


		// Process for if you die.
		if (nextNode.isDeath()) {
			player.clearHistory();
		}

		if (nextNode.getIdentifier() == 9) { // Drop the knife if player reaches node 9.
			if (player.getObjects().contains("knife")) {
				player.dropItem("knife");
			}
		}

		if (nextNode.getObjectFound() != null) { // If player finds an object at this node
			player.addItem(nextNode.getObjectFound());
		}
		if (response == null) response = "You have stumbled upon the unknown, an endless stream of dark matter. AKA Congrats, you found a bug."; // If there is a mistake in the program
        return altMessage + response;
    }



    private Node getCurrentNode(){
        return mapFromIntToNode.get(player.getCurrentPosition());
    }


}
