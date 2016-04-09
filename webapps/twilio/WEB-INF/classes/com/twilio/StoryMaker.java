package com.twilio;

import java.util.ArrayList;
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


//	public StoryMaker(ArrayList<Integer> history) {
//        this.history = history;
//		TrialNodeTest testNodes = new TrialNodeTest();
//		this.mapFromIntToNode = testNodes.getMapFromIntToNode();
//    }



    public String makeResponse(String message) {
		String response = "You have entered an invalid command. Please try again. "; //default response is the invalid user input response.
		if(player.historySize() == 0){
			//message = "a";

			player.addToHistory(0);
			response = "Welcome to the game. These are the instructions";
			return response;
		}
		if(player.historySize() == 1){
			message = "a";
		}
		Node currentNode = getCurrentNode();







		if (message == null) return response + currentNode.getText(); // If player writes a blank message

		Node nextNode = currentNode.whatNext(message); // Add FailSafe to tell user if they have an invalid command





		if(nextNode == null) {  // If user didn't enter a valid command
			return response + currentNode.getText(); // Give error message + Text of last node.
		}

		// Return the node the player tried to go to. Storymaker asks what do you need.Node says I need the key. Check player for the key. If player has key,
		// Allow player to go to that node. else make player go back to currentNode.
		// TODO: Add a new method to determine where they go next and get the message to send.


		// This is allowedNode instead of nextNode. The node the player actually is going to now.
        response = nextNode.getText();
		player.addToHistory(nextNode.getIdentifier());
		if (response == null) response = "no text for this node. There is a problem with the directed graph data structure. Congrats, you found a bug."; // If there is a mistake in the program
        return response;
    }



    private Node getCurrentNode(){
        return mapFromIntToNode.get(player.getCurrentPosition());
    }


}
