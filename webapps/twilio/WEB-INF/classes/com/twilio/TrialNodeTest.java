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
        HashMap<String, Node> optionsNode441Alt = new HashMap<>();
        HashMap<String, Node> optionsNode442Alt = new HashMap<>();
        HashMap<String, Node> optionsNode443Alt = new HashMap<>();
        HashMap<String, Node> optionsNode5 = new HashMap<>();
        HashMap<String, Node> optionsNode6 = new HashMap<>();
        HashMap<String, Node> optionsNode61 = new HashMap<>();
        HashMap<String, Node> optionsNode62 = new HashMap<>();
        HashMap<String, Node> optionsNode63 = new HashMap<>();
        HashMap<String, Node> optionsNode7 = new HashMap<>();
        HashMap<String, Node> optionsNode71 = new HashMap<>();
        HashMap<String, Node> optionsNode711 = new HashMap<>();
        HashMap<String, Node> optionsNode72 = new HashMap<>();
        HashMap<String, Node> optionsNode721 = new HashMap<>();
        HashMap<String, Node> optionsNode8 = new HashMap<>();
        HashMap<String, Node> optionsNode81 = new HashMap<>();
        HashMap<String, Node> optionsNode812 = new HashMap<>();
        HashMap<String, Node> optionsNode82 = new HashMap<>();
        HashMap<String, Node> optionsNode82Alt = new HashMap<>();
        HashMap<String, Node> optionsNode823 = new HashMap<>();
        HashMap<String, Node> optionsNode9 = new HashMap<>();
        HashMap<String, Node> optionsNode91 = new HashMap<>();
        HashMap<String, Node> optionsNode92 = new HashMap<>();
        HashMap<String, Node> optionsNode10 = new HashMap<>();
        HashMap<String, Node> optionsNode101 = new HashMap<>();
        HashMap<String, Node> optionsNode102 = new HashMap<>();



        this.mapFromIntToNode = new HashMap<>();

        Node node1 = new Node(0, "Welcome to the game. Text anything to continue");
        Node node2 = new Node(2, "You open your eyes and find yourself in a dimly lit room. Immediately you try and stand up from the chair you find yourself in but something restrains you. Your wrists and ankles have been tied to the chair with rope. After a brief struggle, you manage to free yourself. A quick glance of the room teaches you a few things. There seems to be a wooden door to the right, along with a desk directly ahead of you. The rest of room is remarkably empty, save for the ubiquitous cobwebs of course. a: Check out the door, b: Check out the desk.");
        Node node21 = new Node(21, "The door is made up of clearly old wood. You would think it would break easily but the lock seems sturdy and thick. a: Try and open the door, b: Go back.");
        Node node22 = new Node(22, "The desk is made up of hard redwood, but you almost couldn't tell given all of the papers scattered across the top. Along with the papers, you notice a drawer. a: Investigate the papers, b: Open the drawer, c: go back");
        Node node221 = new Node(221, "You look over a few of the papers. All of them are dated in the 1970's and seem to concern some company named 'Odin'. After a while, you get bored and decide to stop reading. a: go back");
        Node node222 = new Node(222, "The drawer is empty and remarkably clean when compared to the rest of the room. Perfectly placed in the center is a single brass key. You take it and shut the drawer. a: go back");
        node222.setObjectFound("key");
        Node node3 = new Node(3, "The brass key seems to perfectly fit the lock of this door. You try it and sure enough the door creaks open. You move through the door into the next room." +
                "This room is just as dark as the last. From the low lying ceiling hangs a single lantern with a flame that seems on its last breath. It's hard to make out from here, but there seems to be a stuffed animal on a table stand on the other side of the room. You also notice a dirty mirror to your left. a: Check out that doll, b: Pick up the lantern, c: Look at yourself in the mirror");
        node3.setObjectNeeded("key");
        Node node3Alt = new Node(-3, "After a tough battle the door is still closed. You leave sweaty, embarrassed, and with a splinter.");
        Node node31 = new Node(31, "What you thought was a stuffed animal was actually an old doll falling apart at the seams. Apart from its putrid stench and horrible uglyness, you notice that its one eye is looking directly at your feet. You follow its gaze and see a handle on the floor. a: Open and go through the cellar door. b: Go back");
        Node node32 = new Node(32, "The handle was within reach so you take it easily. However its flame begins to dim even more. It is down to an ember. It won't last much longer. a: Go back");
        node32.setObjectFound("lantern");
        Node node33 = new Node(33, "You almost don't recognize yourself. Your head has been shaved, there is a bruise under your right eye and you look much thinner than before. Just looking at yourself starts to make you feel a bit sick. a: Go back");
        Node node4 = new Node(4, "It feels like you have been descending this ladder for way too long. Just when you begin to get worried and consider going back up, you hit the bottom. There is a long hallway leading from here into a wide and spacious room. It looks like it could have been a dining hall in a past life. As soon as you enter the hall, a series of metal bars shut behind you barring off movement to where you came from. In this room you can see several unlit torches lining the walls along with a lit candle overhead and a small box on the floor in the center of the room. In one corner are a bunch of crates and in the other is a ledge with another door. a: Light the torches. b: Check out the box. c: Check out the crates. d: Get a closer look at the ledge.");
        Node node41 = new Node(41, "You use the lantern to light all of the torches, and the room is much brighter now. You notice that in the corner there is a wrench and you pick it up. a: Go back");
        node41.setObjectNeeded("lantern");
        node41.setObjectFound("wrench");
        Node node41Alt = new Node(-41, "You need a lantern to light the torches and you don't have it.");
        Node node42 = new Node(42, "You kneel down to the box and open it. Inside is a full water bottle. You're surprised but relieved. It is impossible to imagine how good some water could taste right now. You pick the bottle up to your mouth before you notice that there is a string attached to the bottle. Suddenly an ominous rumbling sound begins to fill the room. From creaks and cracks all around the room, swarms of rats begin to rush in, more and more every second. Frantically you stand right up and begin to think of a way out. a: Go back");
        node42.setObjectFound("water bottle");
        Node node43 = new Node(43, "A few of the crates are open, and inside of those you find a large metal chain, several sand bags, and a jug of gasoline. They are each big enough that you can carry only one at a time. a: Take chain. b: Take Sand. c: Take gas. d: Go back");
        Node node44 = new Node(44, "You can see the door above you, it doesn't seem locked but definitely out of reach. A foot below the edge of the ledge is a coat rack. a: Go back");
        Node node441 = new Node(441, "You use the chain to climb up to the door. a: Walk through the door.");
        //node441.setObjectNeeded("water bottle");
        Node node441Alt = new Node(-441, "This item seems too heavy. You don't see a need to carry it right now. a: Go back");
        Node node442 = new Node(442, "Even with the sand bags, you still cannot reach the door. The rats flood the room and eat you alive.");
        node442.setObjectNeeded("water bottle");
        node442.setDeath(true);
        Node node442Alt = new Node(-442, "This item seems too heavy. You don't see a need to carry it right now. Go back");
        Node node443 = new Node(443, "You pour the gas on the rats for some odd reason. One of the rats runs past the lit candle and catches on fire. Now there is a swarm of rats on fire scattering frantically around the room. You die.");
        node443.setObjectNeeded("water bottle");
        node443.setDeath(true);
        Node node443Alt = new Node(-443, "This item seems too heavy. You don't see a need to carry it right now. Go back");
        Node node5 = new Node(5, "Your suspicion that someone is playing some insidious trick on you has been pretty much confirmed. From this door leads to a hallway that forks to the left and to the right. On the right is a courtyard, it would be nice to finally get outside. On the left are more stairs leading down. The sign above the stairs reads 'Boiler Room'. a: Go to courtyard. b: Go to Boiler Room");
        Node node6 = new Node(6, "You can tell that it is somewhere in the early hours of the morning, still dark out but the sun should be rising soon. The courtyard is small and the fences surrounding it are way too high up to climb. In the center is a large palm tree surrounded by some low lying bushes, and along the far end wall, you see a ladder leading onto a roof. a: Get a look through the holes of the fence. b: Sit by the central plants. c: Climb the ladder onto the roof. d: Go back. ");
        Node node61 = new Node(61, "It is difficult to see far given the thick foliage, but you can tell that the estate you've found yourself in is on a large hill. You can't see another town or any signs of civilized life from here at all. a: Go back.");
        Node node62 = new Node(62, "You see some berries growing on the bushes and recognize them as blackberries. You are confident that you'll feel alright eating them. You take this opportunity to sit and rest for a while against the trunk of the palm tree. Somewhere in the soil around the base of the palm tree you find a rusty knife. Maybe it'll come in handy later. a: Go back. ");
        node62.setObjectFound("knife");
        Node node63 = new Node(63, "The ladder isn't too long. On the roof you get a better view of your surroundings and can see thick forests for miles around surrounding this estate. There is a radiator up here with a pair of handcuffs attached to it. It is locked so you have no chance of taking those. You can drop down to the lower level on the other side from where you came but you can't be certain that you'll be able to make it back if you did. a: Drop down. b: Go back. ");
        Node node7 = new Node(7, "You're suddenly hit with a wave of heat and humidity as you enter the Boiler Room. The droning 'thum' noises of machinery persist, drowning out the sounds of your own breath and footsteps. The room is large and despite the interweaving pipes, maneuverable. As you move about the room, you notice a large valve connected to what you believe to be the boiler and a vent on the ceiling. The vent is within reach. a: Check out the valve. b: Look at the vent. c: Go back. ");
        Node node8 = new Node(8, "You've dropped down on to what seems like a pavilion and see huge double doors across from you. As you walk over towards the doors, you hear snarling coming from a dark corner. Out of the corner of your eye, you see a black mass rushing towards you. After you manage to narrowly evade, your eyes meet the crimson demonic gaze of a black boar. The boar is twice as large as any hog you've ever seen and it is sporting two eggshell tusks that put the hairs on the back of your neck on edge. It rushes you again. a: Dodge. b: Fight. c: Run");
        Node node71 = new Node(71, "The valve is large enough that you have to use both hands to turn it. a: Turn the valve. b: Go back");
        Node node72 = new Node(72, "The vent is large enough to crawl through. a: Open the vent. b: Go back");
        Node node711 = new Node(711, "As you turn the valve, the boiler begins to shake more violently and radiate more heat than before. You feel the sweat dripping from all over your body until you realize the heat has just set the sprinklers off in the room. a: Turn the valve. b: Go back" );
        Node node7111 = new Node(7111, "You turn the valve even more, it gets more and more difficult to turn the valve as you go but you continue anyways. At some point, several bolts burst and shoot off from the tank. The boiler instantaneously explodes destroying the room and killing you in the process.");
        node7111.setDeath(true);
        Node node721 = new Node(721, "You unscrew each of the nuts and bolts of the vent and begin crawling through the air ducts. After a while, you drop down into a room where you see a shadowed figure sitting in a chair facing you. a: Crawl through the vent. b: Go Back ");
        node721.setObjectNeeded("wrench");
        Node node721Alt = new Node(-721, "You try to pry open the vent with your bare heads, but it doesn't even budge.");
        Node node81 = new Node(81, "You try and dodge the boar but its tusk still manages to catch your leg. You are hurt. Running won't be an option anymore. a: Dodge. b: Fight");
        Node node811 = new Node(811, "You are unable to avoid the boar's rush. Its mighty tusk pierces your chest and you die.");
        node811.setDeath(true);
        Node node812 = new Node(812, "You get caught in the calf with another tusk but not without repaying the boar in full. You thrust the rusty knife deep into its snout. While the boar is doubled over in pain you limp over to the double doors. a: Walk through the door.");
        node812.setObjectNeeded("knife");
        Node node812Alt = new Node(-812, "The boar pierces your chest and you die.");
        // Proofread up to here.
        node812Alt.setDeath(true);
        Node node82 = new Node(82, "You get caught in the calf with a tusk but not without repaying the boar in full. You thrust the rusty knife deep into its snout. While the boar is doubled over in pain, you limp over to the double doors. a: Walk through the door.");
        node82.setObjectNeeded("knife");
        Node node82Alt = new Node(-82, "The boar pierces your leg. You kick it off but you are badly hurt. a: Dodge. b: Fight. c: Run.");
        Node node821 = new Node(821, "The boar pierces your chest and you die.");
        node821.setDeath(true);
        Node node822 = new Node(822, "The boar pierces your chest and you die.");
        node822.setDeath(true);
        Node node823 = new Node(823, "Your kick was able to create enough separation between you and the boar for you to make it to the double door. a: Walk through the doors.");
        Node node83 = new Node(83, "You try and run but the boar is much faster. His tusk still manages to catch both of your legs. You cannot run, you cannot dodge, you cannot even stand up. You are demon pig chow. You die.");
        node83.setDeath(true);
        Node node9 = new Node(9, "You close the thick double doors behind you. There is a hallway that leads to a single bright red door several meters away. Along both sides of the hall are pictures hung from ornate frames. a: Look at the pictures. b: Open and go through the red door.");
        Node node91 = new Node(91, "All the pictures are of you. You when you were healthy and full of life. You don't recall any of these photos ever being taken. You don't remember ever being in this coffee shop or ever owning that yellow shirt. There is one picture of you with the doll from earlier, the doll is clean and intact in this picture. Your head starts to hurt. As you move along the hall, the pictures become more recent. The penultimate picture is of you with your head shaved flashing a radiant smile to the camera. The last picture is of you knocked out on the chair which you woke up in earlier. a: Walk through the red door.");
        Node node92 = new Node(92, "You open the red door and step into a room. Ahead of you is a shadowy figure sitting in a chair facing you. a: continue");
        Node node10 = new Node(10, "You want to say something but the words get stuck in your throat. The figure welcomes you with a 'hello', in a casual and calm tone. a: Who are you? b: What did you do to me?");
        Node node101 = new Node(101, "You call me Odin. I am the one that orchestrated this little game you've been playing. You've done well to make it this far. a: I've done well to make it this far? What game are you talking about? What the Hell? b: This all seems so familiar, I know I've been here before. I know I've heard your voice before. Let me see your face.");
        Node node1011 = new Node(1011, "The voice lets out a deep sigh. 'Not quite the response I was looking for. Let's go back to square one.' Suddenly you hear a loud thud, you've been hit with some blunt object under your right eye. The world goes black. You open your eyes and find yourself in a dimly lit room.");
        node1011.setDeath(true);
        Node node1012 = new Node(1012, "The voice bellows a hearty laugh, begins to clap, and stands up from the chair. The figure begins to walk towards you. As it steps into the light, you see the figures face take shape. It looks just like you.");
        node1012.setDeath(true);

        Node node102 = new Node(102, "The voice says 'I saw what you were capable of. How you think. What makes you frustrated. You've impressed me so far.' a: Let me show you something to really be impressed about. (attack) b: I'm not some show dog that needs to impress you, give me some answers!");
        Node node1021 = new Node(1021, "You stab the figure with the knife multiple times. You stand above its dead body. In the light you see the figures face looked just like yours.");
        node1021.setDeath(true);
        Node node1021Alt = new Node(-1021, "You tussle with the figure for a bit, your aggression catches it off guard but it unsheathes a knife and kills you.");
        node1021Alt.setDeath(true);
        Node node1022 = new Node(1022, "The voice sighs, 'It seems like this was a failed project after all.' The figure swiftly rushes you and stabs you multiple times, killing you.");
        node1022.setDeath(true);

        optionsNode1.put("a", node2);

        optionsNode2.put("a", node21);
        optionsNode2.put("b", node22);

        optionsNode21.put("a", node3);
        optionsNode21.put("b", node2);

        optionsNode22.put("a", node221);
        optionsNode22.put("b", node222);
        optionsNode22.put("c", node2);


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
        optionsNode43.put("d", node4);

        optionsNode44.put("a", node4);
        optionsNode441.put("a", node5);

        optionsNode441Alt.put("a", node4);
        optionsNode442Alt.put("a", node4);
        optionsNode443Alt.put("a", node4);

        optionsNode5.put("a", node6);
        optionsNode5.put("b", node7);
        optionsNode6.put("a", node61);
        optionsNode6.put("b", node62);
        optionsNode6.put("c", node63);
        optionsNode6.put("d", node5);
        optionsNode61.put("a", node6);
        optionsNode62.put("a", node6);
        optionsNode63.put("a", node8);
        optionsNode63.put("b", node6);
        optionsNode7.put("a", node71);
        optionsNode7.put("b", node72);
        optionsNode7.put("c", node5);
        optionsNode8.put("a", node81);
        optionsNode8.put("b", node82);
        optionsNode8.put("c", node83);

        optionsNode71.put("a", node711);
        optionsNode71.put("b", node7);


        optionsNode72.put("a", node721);
        optionsNode72.put("b", node7);

        optionsNode711.put("a", node7111);
        optionsNode711.put("b", node71);
        optionsNode721.put("a", node10);
        optionsNode721.put("b", node72);

        optionsNode81.put("a", node811);
        optionsNode81.put("b", node812);
        optionsNode812.put("a", node9);
        optionsNode82.put("a", node9);
        optionsNode82Alt.put("a", node821);
        optionsNode82Alt.put("b", node822);
        optionsNode82Alt.put("c", node823);
        optionsNode823.put("a", node9);

        optionsNode9.put("a", node91);
        optionsNode9.put("b", node92);
        optionsNode91.put("a", node92);
        optionsNode92.put("a", node10);
        optionsNode10.put("a", node101);
        optionsNode10.put("b", node102);
        optionsNode101.put("a", node1011);
        optionsNode101.put("b", node1012);
        optionsNode102.put("a", node1021);
        optionsNode102.put("b", node1022);





        node1.setOptions(optionsNode1);
        node2.setOptions(optionsNode2);
        node21.setOptions(optionsNode21);
        node22.setOptions(optionsNode22);
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
        node441Alt.setOptions(optionsNode441Alt);
        node442Alt.setOptions(optionsNode442Alt);
        node443Alt.setOptions(optionsNode443Alt);
        node5.setOptions(optionsNode5);
        node6.setOptions(optionsNode6);
        node61.setOptions(optionsNode61);
        node62.setOptions(optionsNode62);
        node63.setOptions(optionsNode63);
        node7.setOptions(optionsNode7);
        node71.setOptions(optionsNode71);
        node711.setOptions(optionsNode711);
        node72.setOptions(optionsNode72);
        node721.setOptions(optionsNode721);
        node8.setOptions(optionsNode8);
        node81.setOptions(optionsNode81);
        node812.setOptions(optionsNode812);
        node82.setOptions(optionsNode82);
        node82Alt.setOptions(optionsNode82Alt);
        node823.setOptions(optionsNode823);
        node9.setOptions(optionsNode9);
        node91.setOptions(optionsNode91);
        node92.setOptions(optionsNode92);
        node10.setOptions(optionsNode10);
        node101.setOptions(optionsNode101);
        node102.setOptions(optionsNode102);


        mapFromIntToNode.put(node1.getIdentifier(), node1);
        mapFromIntToNode.put(node2.getIdentifier(), node2);
        mapFromIntToNode.put(node21.getIdentifier(), node21);
        mapFromIntToNode.put(node22.getIdentifier(), node22);
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
        mapFromIntToNode.put(node441Alt.getIdentifier(), node441Alt);
        mapFromIntToNode.put(node442Alt.getIdentifier(), node442Alt);
        mapFromIntToNode.put(node443Alt.getIdentifier(), node443Alt);
        mapFromIntToNode.put(node5.getIdentifier(), node5);
        mapFromIntToNode.put(node6.getIdentifier(), node6);
        mapFromIntToNode.put(node61.getIdentifier(), node61);
        mapFromIntToNode.put(node62.getIdentifier(), node62);
        mapFromIntToNode.put(node63.getIdentifier(), node63);
        mapFromIntToNode.put(node7.getIdentifier(), node7);
        mapFromIntToNode.put(node71.getIdentifier(), node71);
        mapFromIntToNode.put(node711.getIdentifier(), node711);
        mapFromIntToNode.put(node7111.getIdentifier(), node7111);
        mapFromIntToNode.put(node721.getIdentifier(), node721);
        mapFromIntToNode.put(node721Alt.getIdentifier(), node721Alt);

        mapFromIntToNode.put(node72.getIdentifier(), node72);
        mapFromIntToNode.put(node8.getIdentifier(), node8);
        mapFromIntToNode.put(node81.getIdentifier(), node81);
        mapFromIntToNode.put(node811.getIdentifier(), node811);
        mapFromIntToNode.put(node812.getIdentifier(), node812);
        mapFromIntToNode.put(node812Alt.getIdentifier(), node812Alt);
        mapFromIntToNode.put(node82.getIdentifier(), node82);
        mapFromIntToNode.put(node82Alt.getIdentifier(), node82Alt);
        mapFromIntToNode.put(node821.getIdentifier(), node821);
        mapFromIntToNode.put(node822.getIdentifier(), node822);
        mapFromIntToNode.put(node823.getIdentifier(), node823);
        mapFromIntToNode.put(node83.getIdentifier(), node83);

        mapFromIntToNode.put(node9.getIdentifier(), node9);

        mapFromIntToNode.put(node91.getIdentifier(), node91);

        mapFromIntToNode.put(node92.getIdentifier(), node92);
        mapFromIntToNode.put(node10.getIdentifier(), node10);
        mapFromIntToNode.put(node101.getIdentifier(), node101);
        mapFromIntToNode.put(node1011.getIdentifier(), node1011);
        mapFromIntToNode.put(node1012.getIdentifier(), node1012);
        mapFromIntToNode.put(node102.getIdentifier(), node102);
        mapFromIntToNode.put(node1021.getIdentifier(), node1021);
        mapFromIntToNode.put(node1021Alt.getIdentifier(), node1021Alt);
        mapFromIntToNode.put(node1022.getIdentifier(), node1022);






    }

    public HashMap<Integer, Node> getMapFromIntToNode(){
        return mapFromIntToNode;
    }
}
