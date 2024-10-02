import java.util.Objects;
import java.util.Scanner;
import java.time.Year;
//creating the name of the game in an ASCII art style
public class Game {
    private static Scanner scanner;

    public static void getName (){
        System.out.println("\nwhat's your name?:");
        String name = scanner.nextLine();
        System.out.println("Hey, "+name+"!");
    }

    public static void calculateAge() {
        System.out.println("\nWhen were you born?(only year):");
        int birthYear = scanner.nextInt();
        int currentYear= Year.now().getValue();
        int age =currentYear - birthYear;
        System.out.println("You are " + age + " years old.");
    }


    public static String getInput() {
        System.out.println("\nWhat would you like to do?:");
        scanner.nextLine();
        String action = scanner.nextLine().toLowerCase();
        if (action.equals("666")){
            System.exit(0);
        }
        else {
            if (action.equals("open the door") || action.equals("go north") || action.equals("go south") || action.equals("go east") || action.equals("go west") || action.equals("take item") || action.equals("drop item") || action.equals("use item")) {
                return action;
            } else {
                System.out.println("Invalid input");
            }
        }
        return null;
    }
    public static int takeAction(String action, int currentState, String[][] stateMatrix) {
       for (int i = 0; i < stateMatrix[0].length; i++) {
           for (int j = 0; j < stateMatrix.length; j++) {
               if (action.equals(stateMatrix[i][j])) {
                   currentState = j;
               }
           }
       }
        return currentState;
    }

    public static void getStory(int stateId, String[] storyArray){
        System.out.println(storyArray[stateId]);
    }

    public static void printState(int currentState, String[] storiesStorage) {
        System.out.println(storiesStorage[currentState]);
    }


    public static void main(String[] args) {
        scanner = new Scanner(System.in);
       System.out.println("┏┳┓┓     ┏┓┓            ┓  ┏┓   ┓ \n" +
               " ┃ ┣┓┏┓  ┗┓┣┓┏┓╋╋┏┓┏┓┏┓┏┫  ┃┃┏┓╋┣┓\n" +
               " ┻ ┛┗┗   ┗┛┛┗┗┻┗┗┗ ┛ ┗ ┗┻  ┣┛┗┻┗┛┗\n");

        System.out.println("\nby: Sofya Grishkova");

        int currentState=0;
        getName();
        calculateAge();

        String[][] statesMatrix = {{ " ", "open the door", "take item", " ", " ", " "},{"go south", " ", " ", "go east", " ", " "},{" ", " "," "," ", "open the door"," "},{" ", " "," "," ", " "," "},{" ", "drop item"," "," ", " ","go north"},{" ", "go south"," "," ", " "," "}};

        System.out.println(
                "You find yourself in a dimly lit control room\n " +
                "filled with flashing lights and monitors showing live feeds\n " +
                "of desolate streets. The air is thick with tension,\n " +
                "and the distant hum of machines fills your ears. On a desk nearby,\n " +
                "there’s a cryptic note and an old, dust-covered radio.\n " +
                "A large metallic door to the south hums with energy.\n " +
                "You sense that danger is close, but you're unsure\n" +
                "from where it will come.\n");

        String stateId = getInput();
        currentState = takeAction(stateId, currentState, statesMatrix);
        String[] storiesStorage = new String[100];
        storiesStorage[0] = ("You decide to inspect the ceiling, hoping to find\n " +
                "an air vent or hidden passage. Your eyes scan the cracked tiles above,\n " +
                "but all you notice is the faint hum of the flickering lights.\n " +
                "There's no secret escape, just the same looming choices ahead.\n " +
                "The corridor feels colder now, as if urging you to make a real decision.\n");
        storiesStorage[1] = ("You step through the metallic door and into a dim corridor,\n " +
                "where the walls are lined with cracked, flickering lights. In the distance,\n " +
                "you hear mechanical sounds, like the clank of metal against metal.\n " +
                "To your east, a control panel flickers with life.\n " +
                "To the north, you sense a faint draft.\n " +
                "You can feel the weight of the unknown pressing down on you.\n " +
                "The way back to the control room is to the south.\n");
        storiesStorage[2] = ("You grab the radio from the desk, wiping away the dust.\n " +
                "As you hold it, you hear static followed by a broken transmission:\n " +
                "\"If you... hear this... get to the east side... the only safe... is...\"\n " +
                "The signal cuts out. You now hold the radio in your hand, hoping it might help you\n " +
                "survive in this unforgiving world.\n");
        storiesStorage[3] = ( "As you move east, the air feels colder,\n " +
                "and the lights dim even more. You reach a room \n" +
                "filled with blinking screens and a large map of the area.\n" +
                "A man stands near the map, dressed in a lab coat and frantically\n " +
                "scribbling notes. His eyes meet yours, filled with both fear and hope.\n " +
                "Before you can speak, he says, \"You have to help us... The system is failing...\n " +
                "We’re running out of time.\" Behind him, the map shows the last known safe zones,\n " +
                "each one crossed out.\n ");
        storiesStorage[4] = ("You step into a room where an eerie silence fills the air.\n"+
                "The only light comes from a faintly glowing monitor on an old desk.\n"+
                "The walls are covered in maps, each one telling a story of long-forgotten locations.\n"+
                "Dust lingers in the air, and the smell of aged paper surrounds you.\n"+
                "A single piece of paper lies on the desk, with strange symbols scribbled across it.\n"+
                "To the west, there’s a door that seems slightly ajar, while to the north, you notice a large metallic cabinet, sealed tightly.\n"+
                "The feeling of unease creeps up your spine as you sense you’re not alone here.");
        storiesStorage[5] = ("You walk through the narrow corridor, your footsteps echoing in the hollow space."+
                "Flickering lights overhead cast long shadows on the cracked walls.\n "+
                "As you continue, you notice a small, partially open vent to the east.\n"+
                "The faint sound of whispers reaches your ears from within, but it’s unclear what they’re saying.\n"+
                "Further down the corridor, a rusted ladder leads up to a hatch in the ceiling.\n"+
                "To the south, you see the familiar metallic door you came through earlier.\n"+
                "A strange chill fills the air, urging you to decide quickly:\n" +
                " do you investigate the vent, climb the ladder, or return to the safety of the previous room?\n");
        printState(currentState, storiesStorage);
    }
}
