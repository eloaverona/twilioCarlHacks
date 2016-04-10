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
        HashMap<String, Node> optionsNode22 = new HashMap<>();
        HashMap<String, Node> optionsNode211 = new HashMap<>();
        HashMap<String, Node> optionsNode221 = new HashMap<>();
        HashMap<String, Node> optionsNode222 = new HashMap<>();

        this.mapFromIntToNode = new HashMap<>();

        Node node1 = new Node(0, "Welcome to the game. Text anything to continue");
        Node node2 = new Node(2, "You open your eyes and find yourself in a dimly lit room, immediately you try and stand up from the chair you find yourself in but something restrains you. Your wrists and ankles have been tied to the chair with rope, after a brief struggle you manage to free yourself. A quick glance of the room teaches you a few things. There seems to be a wooden door to the right, along with a desk directly ahead of you. The rest of room is remarkably empty, save for the ubiquitous cobwebs of course. a: Check out the door, b: Check out the desk.");
        Node node21 = new Node(21, "The door is made up of clearly old wood, you would think it would break easily but the lock seems sturdy and thick. a: Try and open the door, b: Go back.");
        Node node22 = new Node(22, "The desk is made up of hard redwood, but you almost couldn’t tell given all the papers scattered across the top. Along with the papers you notice a drawer. a: Investigate the paper, b: Open the drawer, c: go back");
       // Node node211 = new Node(211, "MUST CLEAR UP HOW TO HANDLE KEY SCENERIO. a: Try and open the door, b: Go back");
        Node node221 = new Node(221, "You look over a few of the papers, all of them are dated in the 1970’s and seem to concern some company named “Odin”. After a while you get bored and decide to stop reading. a: go back");
        Node node222 = new Node(222, "The drawer is empty and remarkably clean when compared to the rest of the room. Perfectly placed in the center is a single brass key. You take it and shut the drawer.. a: go back");
        node222.setObjectFound("key");
        Node node3 = new Node(3, "The brass key seems to perfect fit the lock of this door. You try it and sure enough the door creaks open. You moved through the door into the next room. You lose the Brass key.\n" +
                "This room is just as dark as the last, from the low lying ceiling hangs a single lantern with a flame that seems on its last breath. It’s hard to make out from here but there seems to be a stuffed animal on a table stand on the other side of the room. You also notice a dirty mirror to your left.");
        node3.setObjectNeeded("key");
        Node node3Alt = new Node(-3, "After a tough battle the door is still closed, you leave sweaty, embarrassed and with a splinter.");

        optionsNode1.put("a", node2);

        optionsNode2.put("a", node21);
        optionsNode2.put("b", node22);

        optionsNode21.put("a", node3);
        optionsNode21.put("b", node2);

        optionsNode22.put("a", node221);
        optionsNode22.put("b", node222);
        optionsNode22.put("c", node2);


        optionsNode211.put("a", node21);
        optionsNode221.put("a", node22);
        optionsNode222.put("a", node22);


        node1.setOptions(optionsNode1);
        node2.setOptions(optionsNode2);
        node21.setOptions(optionsNode21);
        node22.setOptions(optionsNode22);
        //node211.setOptions(optionsNode211);
        node221.setOptions(optionsNode221);
        node222.setOptions(optionsNode222);


        mapFromIntToNode.put(node1.getIdentifier(), node1);
        mapFromIntToNode.put(node2.getIdentifier(), node2);
        mapFromIntToNode.put(node21.getIdentifier(), node21);
        mapFromIntToNode.put(node22.getIdentifier(), node22);
       // mapFromIntToNode.put(node211.getIdentifier(), node211);
        mapFromIntToNode.put(node221.getIdentifier(), node221);
        mapFromIntToNode.put(node222.getIdentifier(), node222);
        mapFromIntToNode.put(node3.getIdentifier(), node3);
        mapFromIntToNode.put(node3Alt.getIdentifier(), node3Alt);




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
