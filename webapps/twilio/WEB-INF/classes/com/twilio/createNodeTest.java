package com.twilio;
import java.util.HashMap;


/**
 * Created by Brett Graham on 4/8/2016.
 * This class creates a bunch of nodes for testing purposes.
 */
public class CreateNodeTest{

    private HashMap<Integer, Node>  mapFromIntToNode; //This hashmap it what maps an identifier to a particular node. It is used in storymaker
    //to identify where in the story the user currently is and to record where the user is going next;

    public CreateNodeTest(){
        HashMap<String, Node> optionsNode1 = new HashMap<>();
        HashMap<String, Node> optionsNode2 = new HashMap<>();
        HashMap<String, Node> optionsNode3 = new HashMap<>();
        this.mapFromIntToNode = new HashMap<>();
        Node node1 = new Node("Welcome to the game. a: go to node 2, b: go to node 3");
        Node node2 = new Node("You have made it to node 2. a: go back to node 1 , b: go to node 3");
        Node node3 = new Node("You have made it to node 3. a: go back to node 1, b: go back to node 2");

        optionsNode1.put("a", node2);
        optionsNode1.put("b", node3);

        optionsNode2.put("a", node1);
        optionsNode2.put("b", node3);

        optionsNode3.put("a", node1);
        optionsNode3.put("b", node2);

        node1.setOptions(optionsNode1);
        node2.setOptions(optionsNode2);
        node3.setOptions(optionsNode3);

        node1.setIdentifier(0);
        node2.setIdentifier(1);
        node3.setIdentifier(2);

        mapFromIntToNode.put(node1.getIdentifier(), node1);
        mapFromIntToNode.put(node2.getIdentifier(), node2);
        mapFromIntToNode.put(node3.getIdentifier(), node3);



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
