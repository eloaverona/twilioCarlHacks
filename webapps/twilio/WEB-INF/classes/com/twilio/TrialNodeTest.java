package com.twilio;
import java.util.HashMap;


/**
 * Created by Brett Graham on 4/8/2016.
 * This class creates a bunch of nodes for testing purposes.
 */
public class TrialNodeTest {

    private HashMap<Integer, Node>  mapFromIntToNode; //This hashmap it what maps an identifier to a particular node. It is used in storymaker
    //to identify where in the story the user currently is and to record where the user is going next;

    public TrialNodeTest(){

        HashMap<String, Node> optionsNode1 = new HashMap<>();
        HashMap<String, Node> optionsNode2 = new HashMap<>();
        HashMap<String, Node> optionsNode21 = new HashMap<>();
        HashMap<String, Node> optionsNode26 = new HashMap<>();
        this.mapFromIntToNode = new HashMap<>();

        Node node1 = new Node(0, "Welcome to the game. Text anything to continue");
        Node node2 = new Node(2, "You open your eyes and find yourself in a dimly lit room, immediately you try and stand up from the chair you find yourself in but something restrains you. Your wrists and ankles have been tied to the chair with rope, after a brief struggle you manage to free yourself. A quick glance of the room teaches you a few things. There seems to be a wooden door to the right, along with a desk directly ahead of you. The rest of room is remarkably empty, save for the ubiquitous cobwebs of course. a: Check out the door, b: Check out the desk.");
        Node node21 = new Node(21, "The door is made up of clearly old wood, you would think it would break easily but the lock seems sturdy and thick. a: Try and open the door, b: Go back.");
        Node node22 = new Node(22, "The desk is made up of hard redwood, but you almost couldn’t tell given all the papers scattered across the top. Along with the papers you notice a drawer. a: Investigate the paper, b: Open the drawer");

        optionsNode1.put("a", node2);

        optionsNode2.put("a", node21);
        optionsNode2.put("b", node22);

        optionsNode21.put("b", node2);
        optionsNode21.put("a", node2);

        optionsNode26.put("a", node2);
        optionsNode26.put("b", node21);

        node1.setOptions(optionsNode1);
        node2.setOptions(optionsNode2);
        node21.setOptions(optionsNode21);
        node22.setOptions(optionsNode26);


        mapFromIntToNode.put(node1.getIdentifier(), node1);
        mapFromIntToNode.put(node2.getIdentifier(), node2);
        mapFromIntToNode.put(node21.getIdentifier(), node21);
        mapFromIntToNode.put(node22.getIdentifier(), node22);



        // Node node2 = new Node("Node 2 test", node1);
        // Node node3 = new Node("Node 3 test", node2); // Set previous to be node at last element Integer of history instead
        // optionsNode1.put("option1", node2);
        // optionsNode1.put("option2", node3);
        // node1.setOptions(optionsNode1);
        // optionsNode2.put("option1", node3);
        // node2.setOptions(optionsNode2);
        // node1.setIdentifier(0);
        // node2.setIdentifier(1);
        // node3.setIdentifier(2);
        // mapFromIntToNode.put(node1.getIdentifier(), node1);
        // mapFromIntToNode.put(node2.getIdentifier(), node2);
        // mapFromIntToNode.put(node3.getIdentifier(), node3);

    }

    public HashMap<Integer, Node> getMapFromIntToNode(){
        return mapFromIntToNode;
    }
}
