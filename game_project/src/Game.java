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
        if (action.equals("quit")){
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
    public static void takeAction(String action, int currentState) {
        switch(action){
            case "open the door": currentState = 1; break;
            case "take them": currentState = 2; break;
            case "go east": currentState = 3; break;
            default: currentState = 0;break;
        }
    }

    public static void printState(int currentState){
        switch (currentState){
            case 0: System.out.println("You decide to inspect the ceiling, hoping to find\n " +
                    "an air vent or hidden passage. Your eyes scan the cracked tiles above,\n " +
                    "but all you notice is the faint hum of the flickering lights.\n " +
                    "There's no secret escape, just the same looming choices ahead.\n " +
                    "The corridor feels colder now, as if urging you to make a real decision.\n"); break;

            case 1: System.out.println("You step through the metallic door and into a dim corridor,\n " +
                    "where the walls are lined with cracked, flickering lights. In the distance,\n " +
                    "you hear mechanical sounds, like the clank of metal against metal.\n " +
                    "To your east, a control panel flickers with life.\n " +
                    "To the north, you sense a faint draft.\n " +
                    "You can feel the weight of the unknown pressing down on you.\n " +
                    "The way back to the control room is to the south.\n"); break;

            case 2: System.out.println("You grab the radio from the desk, wiping away the dust.\n " +
                    "As you hold it, you hear static followed by a broken transmission:\n " +
                    "\"If you... hear this... get to the east side... the only safe... is...\"\n " +
                    "The signal cuts out. You now hold the radio in your hand, hoping it might help you\n " +
                    "survive in this unforgiving world.\n"); break;
            case 3: System.out.println(
                                                    "As you move east, the air feels colder,\n " +
                                                    "and the lights dim even more. You reach a room \n" +
                                                    "filled with blinking screens and a large map of the area.\n" +
                                                    "A man stands near the map, dressed in a lab coat and frantically\n " +
                                                    "scribbling notes. His eyes meet yours, filled with both fear and hope.\n " +
                                                    "Before you can speak, he says, \"You have to help us... The system is failing...\n " +
                                                    "We’re running out of time.\" Behind him, the map shows the last known safe zones,\n " +
                                                    "each one crossed out.\n "); break;
        }
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
        takeAction(stateId, currentState);
        printState(currentState);
    }
}
