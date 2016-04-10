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
        HashMap<String, Node> optionsNode3 = new HashMap<>();
        HashMap<String, Node> optionsNode31 = new HashMap<>();
        HashMap<String, Node> optionsNode32 = new HashMap<>();
        HashMap<String, Node> optionsNode33 = new HashMap<>();
        HashMap<String, Node> optionsNode4 = new HashMap<>();
        HashMap<String, Node> optionsNode41 = new HashMap<>();
        HashMap<String, Node> optionsNode42 = new HashMap<>();
        HashMap<String, Node> optionsNode43 = new HashMap<>();
        HashMap<String, Node> optionsNode44 = new HashMap<>();
        HashMap<String, Node> optionsNode441 = new HashMap<>();
        HashMap<String, Node> optionsNode5 = new HashMap<>();
        HashMap<String, Node> optionsNode6 = new HashMap<>();

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
                "This room is just as dark as the last, from the low lying ceiling hangs a single lantern with a flame that seems on its last breath. It’s hard to make out from here but there seems to be a stuffed animal on a table stand on the other side of the room. You also notice a dirty mirror to your left. a: Check out that doll, b: Pick up the lantern, c: Look at yourself in the mirror");
        node3.setObjectNeeded("key");
        Node node3Alt = new Node(-3, "After a tough battle the door is still closed, you leave sweaty, embarrassed and with a splinter.");
        Node node31 = new Node(31, "What you thought was a stuffed animal was actually an old doll falling apart at the seams. Apart from its putrid stench and horrible uglyness you notice that it’s one eye is looking directly at your feet. You follow its gaze and see a handle on the floor. a: Open and go through the cellar door. b: Go back");
        Node node32 = new Node(32, "The handle was within reach so you take it easily. However it’s flame begins to dim even more, it’s down to an ember. It won’t last much longer. a: Go back");
        node32.setObjectFound("lantern");
        Node node33 = new Node(33, "You almost don't recognize yourself. Your head has been shaved, there is a bruise under your right eye and you look much thinner than before. Just looking at yourself starts to make you feel a bit sick.");
        Node node4 = new Node(4, "It feels like you’ve been descending this ladder for way too long. Just when you begin to get worried and consider going back up, you hit the bottom. There’s a long hallway leading from here into a wide and spacious room, it looks like it could have been a dining hall in a past life. As soon as you enter the hall a series of metal bars shut behind you barring off movement to where you came from. In this room you can see several unlit torches lining the walls along with a lit candle overhead and a small box on the floor in the center of the room. In one corner are a bunch of crates and in the other is a ledge with another door. a: Light the torches. b: Check out the box. c: Check out the crates. d: Get a closer look at the ledge.");
        Node node41 = new Node(41, "You use the lantern to light all the torches, the room is much brighter now. You notice that in the corner there is a wrench and you pick it up. a: Go back");
        node41.setObjectNeeded("lantern");
        node41.setObjectFound("wrench");
        Node node41Alt = new Node(-41, "You need a lantern to light the torches and you don’t have it.");
        Node node42 = new Node(42, "You kneel down to the box and open it, inside is a full water bottle. You’re surprised but relieved, it’s impossible to imagine how good some water could taste right now. You pick the bottle up to your mouth before you notice there’s a string attached to the bottle and suddenly an ominous rumbling sound begins to fill the room. From creaks and cracks all around the room swarms of rats begin to rush in, more and more every second. Frantically you stand right up and begin to think of a way out. a: Go back");
        Node node43 = new Node(43, "A few of the crates are open, inside of those you find a large metal chain, several sand bags, and a jug of gasoline. They are each big enough that you can carry only one at a time. a: Take chain. b: Take Sand. c: Take gas.");
        Node node44 = new Node(44, "You can see the door above you, it doesn’t seem locked but definitely out of reach. A foot below the edge of the ledge is a coat rack. a: Go back");
        Node node441 = new Node(441, "Use chain to climb up to the door. a: Walk through the door.");
        Node node442 = new Node(442, "Even with the sand bags you still can’t reach the door. The rats flood the room and eat you alive.");
        node442.setDeath(true);
        Node node443 = new Node(443, "You pour the gas on the rats for some odd reason. One of the rat runs past the lit candle and catches on fire. Now there is a swarm of rats on fire going frantic around the room. You die.");
        node443.setDeath(true);
        Node node5 = new Node(5, "Your suspicion that someone is playing some insidious trick on you has been pretty much confirmed. From this door leads to a hallway that forks to the left and to the right. On the right is a courtyard, it would be nice to finally get outside. On the left are more stairs leading down, the sign above the stairs reads “Boiler room”. a: Go to courtyard. b: Go to Boiler room");
        Node node6 = new Node(6, "You can tell that it’s somewhere in the early hours of the morning, still dark out but the sun should be rising soon. The courtyard is small and the fences surrounding it are way too high up to climb. In the center is a large palm tree surrounded by some low lying bushes, and along the far end wall you see a ladder leading onto a roof. a: Get a look through the holes of the fence. b: Sit by the central plants. c: Climb the ladder onto the roof.");

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

        optionsNode3.put("a", node31);
        optionsNode3.put("b", node32);
        optionsNode3.put("c", node33);

        optionsNode31.put("a", node4);
        optionsNode31.put("b", node3);

        optionsNode32.put("a", node3);

        optionsNode33.put("a", node3);

        optionsNode4.put("a", node41);
        optionsNode4.put("b", node42);
        optionsNode4.put("c", node43);
        optionsNode4.put("d", node44);

        optionsNode41.put("a", node4);
        optionsNode42.put("a", node4);
        optionsNode43.put("a", node441);
        optionsNode43.put("b", node442);
        optionsNode43.put("c", node443);
        optionsNode44.put("a", node4);
        optionsNode441.put("a", node5);
        optionsNode5.put("a", node6);
        //optionsNode5.put("b", node7);
        //optionsNode6.put("a", node61);


        node1.setOptions(optionsNode1);
        node2.setOptions(optionsNode2);
        node21.setOptions(optionsNode21);
        node22.setOptions(optionsNode22);
        //node211.setOptions(optionsNode211);
        node221.setOptions(optionsNode221);
        node222.setOptions(optionsNode222);

        node3.setOptions(optionsNode3);
        node31.setOptions(optionsNode31);
        node32.setOptions(optionsNode32);
        node33.setOptions(optionsNode33);

        node4.setOptions(optionsNode4);
        node41.setOptions(optionsNode41);
        node42.setOptions(optionsNode42);
        node43.setOptions(optionsNode43);
        node44.setOptions(optionsNode44);
        node441.setOptions(optionsNode441);
        node5.setOptions(optionsNode5);




        mapFromIntToNode.put(node1.getIdentifier(), node1);
        mapFromIntToNode.put(node2.getIdentifier(), node2);
        mapFromIntToNode.put(node21.getIdentifier(), node21);
        mapFromIntToNode.put(node22.getIdentifier(), node22);
       // mapFromIntToNode.put(node211.getIdentifier(), node211);
        mapFromIntToNode.put(node221.getIdentifier(), node221);
        mapFromIntToNode.put(node222.getIdentifier(), node222);
        mapFromIntToNode.put(node3.getIdentifier(), node3);
        mapFromIntToNode.put(node3Alt.getIdentifier(), node3Alt);
        mapFromIntToNode.put(node31.getIdentifier(), node31);
        mapFromIntToNode.put(node32.getIdentifier(), node32);
        mapFromIntToNode.put(node33.getIdentifier(), node33);
        mapFromIntToNode.put(node4.getIdentifier(), node4);
        mapFromIntToNode.put(node41.getIdentifier(), node41);
        mapFromIntToNode.put(node41Alt.getIdentifier(), node41Alt);
        mapFromIntToNode.put(node42.getIdentifier(), node42);
        mapFromIntToNode.put(node43.getIdentifier(), node43);
        mapFromIntToNode.put(node44.getIdentifier(), node44);
        mapFromIntToNode.put(node441.getIdentifier(), node441);
        mapFromIntToNode.put(node442.getIdentifier(), node442);
        mapFromIntToNode.put(node443.getIdentifier(), node443);
        mapFromIntToNode.put(node5.getIdentifier(), node5);
        mapFromIntToNode.put(node6.getIdentifier(), node6);





    }

    public HashMap<Integer, Node> getMapFromIntToNode(){
        return mapFromIntToNode;
    }
}
