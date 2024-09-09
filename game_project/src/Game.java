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

    public static void firstAction() {
        System.out.println("\nWhat would you like to do?:");
        scanner.nextLine();
        String action = scanner.nextLine();
        if (Objects.equals(action, "Open the door")){
            System.out.println("\nOpen the door");
        }
        else{
            System.out.println("\nYou can't do this");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        //first variant of the title
       /* System.out.println("       __                    _          ___       __                 __                \n" +
                "      / /__  ____________  _( )_____   /   | ____/ /   _____  ____  / /___  __________ \n" +
                " __  / / _ \\/ ___/ ___/ / / /// ___/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\\n" +
                "/ /_/ /  __/ /  / /  / /_/ / (__  )  / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/\n" +
                "\\____/\\___/_/  /_/   \\__, / /____/  /_/  |_\\__,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/ \n" +
                "                    /____/                                                            "); */

        //preferable variant of the title
        System.out.println(" " +
                "_____                                 __               ______      __                         __                           \n" +
                "/\\___ \\                               /\\ \\             /\\  _  \\    /\\ \\                       /\\ \\__                        \n" +
                "\\/__/\\ \\     __   _ __   _ __   __  __\\ \\/      ____   \\ \\ \\L\\ \\   \\_\\ \\  __  __     __    ___\\ \\ ,_\\  __  __  _ __    __   \n" +
                "   _\\ \\ \\  /'__`\\/\\`'__\\/\\`'__\\/\\ \\/\\ \\\\/      /',__\\   \\ \\  __ \\  /'_` \\/\\ \\/\\ \\  /'__`\\/' _ `\\ \\ \\/ /\\ \\/\\ \\/\\`'__\\/'__`\\ \n" +
                "  /\\ \\_\\ \\/\\  __/\\ \\ \\/ \\ \\ \\/ \\ \\ \\_\\ \\      /\\__, `\\   \\ \\ \\/\\ \\/\\ \\L\\ \\ \\ \\_/ |/\\  __//\\ \\/\\ \\ \\ \\_\\ \\ \\_\\ \\ \\ \\//\\  __/ \n" +
                "  \\ \\____/\\ \\____\\\\ \\_\\  \\ \\_\\  \\/`____ \\     \\/\\____/    \\ \\_\\ \\_\\ \\___,_\\ \\___/ \\ \\____\\ \\_\\ \\_\\ \\__\\\\ \\____/\\ \\_\\\\ \\____\\\n" +
                "   \\/___/  \\/____/ \\/_/   \\/_/   `/___/> \\     \\/___/      \\/_/\\/_/\\/__,_ /\\/__/   \\/____/\\/_/\\/_/\\/__/ \\/___/  \\/_/ \\/____/\n" +
                "                                    /\\___/                                                                                  \n" +
                "                                    \\/__/                                                                                   ");

        //third variant of the title
       /* System.out.println("  ____    ___  ____   ____   __ __  __  _____      ____  ___    __ __    ___  ____   ______  __ __  ____     ___ \n" +
                " |    |  /  _]|    \\ |    \\ |  T  TT  |/ ___/     /    T|   \\  |  T  |  /  _]|    \\ |      T|  T  T|    \\   /  _]\n" +
                " l__  | /  [_ |  D  )|  D  )|  |  |l_ (   \\_     Y  o  ||    \\ |  |  | /  [_ |  _  Y|      ||  |  ||  D  ) /  [_ \n" +
                " __j  |Y    _]|    / |    / |  ~  |  \\l\\__  T    |     ||  D  Y|  |  |Y    _]|  |  |l_j  l_j|  |  ||    / Y    _]\n" +
                "/  |  ||   [_ |    \\ |    \\ l___, |    /  \\ |    |  _  ||     |l  :  !|   [_ |  |  |  |  |  |  :  ||    \\ |   [_ \n" +
                "\\  `  ||     T|  .  Y|  .  Y|     !    \\    |    |  |  ||     | \\   / |     T|  |  |  |  |  l     ||  .  Y|     T\n" +
                " \\____jl_____jl__j\\_jl__j\\_jl____/      \\___j    l__j__jl_____j  \\_/  l_____jl__j__j  l__j   \\__,_jl__j\\_jl_____j\n" +
                "                                                                                                                 ");*/

        System.out.println("\nby: Sofya Grishkova");

        getName();
        calculateAge();


       System.out.println("You are standing in an abandoned university office. There are neither students\n" +
                "nor teachers around you. There's a table in front of you with various papers,\n" +
                "pens, a small puzzle toy, and a calculator.\n" +
                "A large window shows an empty office building; there are no Zombies in the empty\n" +
                "building (as far as you can tell). Behind you is a dark and mysterious door that\n" +
                "leads to a well-lit corridor with a fireproof ceiling and floor. You feel a\n" +
                "sense of Wi-Fi around you, the grinding of an LCD operated coffee machine can be\n" +
                "heard in the distance. You are not thirsty, but you rather have a craving for\n" +
                "justice.");

        firstAction();


    }
}
