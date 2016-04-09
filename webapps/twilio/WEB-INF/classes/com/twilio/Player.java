package com.twilio;

import java.util.ArrayList;

/**
 * Created by Brett Graham on 4/9/2016.
 */
public class Player {


    private ArrayList<String> objects;
    private ArrayList<Integer> history;

    /**
        * A constructor for the player class, it takes in one parameter, the name of the player.
        *
        *
        */
         public Player() {

             objects = new ArrayList<String>();
             history = new ArrayList<Integer>();
             history.add(0);
        }


        //just a method to update the status of multiple items on the player.
        public boolean findItem(String item) {
           for(String object: objects){
               if(item.equals(object)) return true;
           }
            return false;
        }

        public void addItem(String item){
            objects.add(item);
        }

        public void addToHistory(Integer currentPosition){
            history.add(currentPosition);
        }

        public Integer getCurrentPosition(){
            return history.get(history.size()-1);
        }


        public int historySize(){
            return history.size();
        }


 }

