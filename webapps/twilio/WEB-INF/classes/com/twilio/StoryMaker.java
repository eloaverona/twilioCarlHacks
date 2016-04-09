package com.twilio;

import java.util.ArrayList;


/**
 * Created by CarlHacks Team.
 */


 public class StoryMaker {

   ArrayList<Integer> history;



   public StoryMaker(ArrayList<Integer> history) {
     this.history = history;
   }


   

   public String makeResponse(String message) {

       //node = history.getLastVisited();
      
	   
	  
      String response = "";
	  if(history.size() == 0) {
		  response = "You have 3 options!. Text back 1, 2 or 3";
		  history.add(0);
		  return response;
	  }		
	
	  if(message == null) return response;
      switch (message) {
        case "1":  response = "You chose option 1! You win a prize";
					history.add(1);
				   break;
        case "2":  response = "You chose option 2! You lost!";
					history.add(2);
                     break;
		case "3":  response =  "You chose option 3! You lost!";
                 break;
      //      case 4:  monthString = "April";
      //               break;
      //      default: monthString = "Invalid month";
      //               break;
       }
     return response;



   }




  


 }
