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


   public Integer getLastVisited() {
     return history.get(history.size()-1);
   }


   public String makeResponse(String message) {

       //node = history.getLastVisited();
      Integer number = history.size();

      String response = "Hey, you have now texted me " + number + "times.";
      history.add(number);

      //  switch (node) {
      //      case 1:  monthString = "January";
      //               break;
      //      case 2:  monthString = "February";
      //               break;
      //      case 3:  monthString = "March";
      //               break;
      //      case 4:  monthString = "April";
      //               break;
      //      default: monthString = "Invalid month";
      //               break;
      //  }
     return response;



   }




  


 }
