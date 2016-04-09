package com.twilio;

/**
 * Created by Brett Graham on 4/9/2016.
 */
public class Player {

    private String name;
    private int maxHealth = 10;
    public int health = maxHealth;
    public boolean hasCrowbar;

        /**
        * A constructor for the player class, it takes in one parameter, the name of the player.
        *
        * @param name The name of the player
        */
         public Player(String name) {
          this.name = name;
        }

        //method to work with damaging or healing the player
        public boolean changeHealth(int change) {
            if (health + change <= 0) {
                return false; //in case the player dies.
            } else if (health + change > maxHealth) { //if this action would put the player above max health
                health = maxHealth;
                return true;
            } else {
                health += change; //the players health is now equal to the previous health plus the change. Negative values are allowed.
                return true;
            }
        }


        //just a method to update the status of multiple items on the player.
        public void findItem(String item) {
            if (item.equals("Crowbar")) {
                hasCrowbar = true;
            }
        }
 }

