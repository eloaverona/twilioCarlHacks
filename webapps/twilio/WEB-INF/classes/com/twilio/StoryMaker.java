package com.twilio;

import java.util.ArrayList;
import java.util.HashMap; 


/**
 * Created by CarlHacks Team.
 */


 public class StoryMaker {

   private ArrayList<Integer> history;
   private HashMap<Integer, Node> mapFromIntToNode;
   private String defaultResponse  = "No reponse";



   public StoryMaker(ArrayList<Integer> history) {
     this.history = history;
	 createNodeTest testNodes = new createNodeTest();
	 mapFromIntToNode = testNodes.getMapFromIntToNode();	 
   }


   

   public String makeResponse(String message) {

           
	  Node currentNode = getCurrentNode();
	   
	  
      String response = defaultResponse; //default response
	  
	  if(history.size() == 0) {
		  response = currentNode.getText();
		  history.add(currentNode.getIdentifier());
		  return response;
	  }		
	
	  if(message == null) return response;
	  Node nextNode = currentNode.whatNext(message);
	  if(nextNode == null) {
		  response = defaultResponse + " nextNode is null (storyMaker line 44)";
		  return response;
	  }  
      response = nextNode.getText();
	  history.add(nextNode.getIdentifier());
	  if(response == null) response = "no response";
      return response;

   }
   
   private Node getCurrentNode(){
	   if(history.size() == 0) return mapFromIntToNode.get(0);
	   return mapFromIntToNode.get(history.get(history.size()-1));
   }




  


 }
