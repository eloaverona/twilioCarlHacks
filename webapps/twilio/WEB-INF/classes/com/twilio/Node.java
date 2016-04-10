package com.twilio;
import java.util.HashMap;
import java.util.Set;


/**
 * Created by Brett Graham on 4/8/2016.
 * Class that contains info about parts of the story.
 */
public class Node {
    //private static final String optionGoBack = "Back"; //this is what the user must type if they want to go back in the game
    // I don't think we need a back button. It just makes out program more likely to break. We can just put the go back option in the options hash map.
    // I think we can think of our story graph as more of a graph then a tree. where there isn't necessrily a forward direction but just a new direction.
    private HashMap<String, Node> options; //hash map that connects the options moving forward to the correspondent nodes
    private String text; //text that contains description of the current scene
    private Integer identifier; // Integer that identifies each node uniquely;
    private boolean death; // Specifies if the node will kill the player
    private String objectFound;
    private String objectNeeded;




    public Node(Integer identifier, String text, HashMap<String, Node> options, boolean death, String objectFound, String objectNeeded) {
        this.identifier = identifier;
        this.text = text;
        this.options = options;
        this.death = death;
        this.objectFound = objectFound;
        this.objectNeeded = objectNeeded;
    }

    public Node(Integer identifier, String text) {
        this(identifier, text, null, false, null, null);
    }




	// this methods takes in a String that is the user choice of a move and return the Node that the user will be next
    public Node whatNext(String userOption) { 
		    //if(userOption.equals(optionGoBack))  { return prev; }

        Set<String> currentOptions =  options.keySet();
        for(String option : currentOptions){
            if(userOption.equals(option)){
                return (options.get(option));
            }
        }
        return null;
    }




    public void setOptions(HashMap<String, Node> options) {
        this.options = options;
    }

    public void setIdentifier(Integer id){
		    identifier = id;
	  }
    public Integer getIdentifier(){
		    return identifier;
	  }



    public String getText(){return text;}

    public void setText(String text){this.text=text;}


    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }

    public String getObjectFound() {
        return objectFound;
    }

    public void setObjectFound(String objectFound) {
        this.objectFound = objectFound;
    }

    public String getObjectNeeded() {
        return objectNeeded;
    }

    public void setObjectNeeded(String objectNeeded) {
        this.objectNeeded = objectNeeded;
    }

    public HashMap<String, Node> getOptions() {

        return options;
    }
}
