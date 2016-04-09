package com.twilio;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by CarlHacks Team.
 */

public class StoryMaker {

    private ArrayList<Integer> history;
    private HashMap<Integer, Node> mapFromIntToNode;


	public StoryMaker(ArrayList<Integer> history) {
        this.history = history;
		TrialNodeTest testNodes = new TrialNodeTest();
		this.mapFromIntToNode = testNodes.getMapFromIntToNode();
    }




    public String makeResponse(String message) {



		Node currentNode = getCurrentNode();
		String response = "You have entered an invalid command. Please try again. "; //default response is the invalid user input response.

		if (history.size() == 0) {
			response = currentNode.getText();
			history.add(currentNode.getIdentifier());
			return response;
		}

		if (message == null) return response;

		Node nextNode = currentNode.whatNext(message); // Add FailSafe to tell user if they have an invalid command

		if(nextNode == null) { // This might be the end of the game or a dead end.
			response += currentNode.getText(); // Give error message + Text of last node.
			return response;
		}
        response = nextNode.getText();
		history.add(nextNode.getIdentifier());
		if (response == null) response = "no text for this node. There is a problem with the directed graph data structure. Congrats, you found a bug."; // If there is a mistake in the program

        return response;
    }



    private Node getCurrentNode(){
        if (history.size() == 0) return mapFromIntToNode.get(0);
    	  return mapFromIntToNode.get(history.get(history.size()-1));
    }


}
