import java.util.Scanner;
//creating the name of the game in an ASCII art style
public class Game{
    private static Scanner scanner;
    public static void main(String[] args){
        scanner=new Scanner(System.in);
        // ----- Write your code below
        System.out.println("       __                    _          ___       __                 __                \n" +
                "      / /__  ____________  _( )_____   /   | ____/ /   _____  ____  / /___  __________ \n" +
                " __  / / _ \\/ ___/ ___/ / / /// ___/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\\n" +
                "/ /_/ /  __/ /  / /  / /_/ / (__  )  / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/\n" +
                "\\____/\\___/_/  /_/   \\__, / /____/  /_/  |_\\__,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/ \n" +
                "                    /____/                                                            ");
        System.out.println("\nby: Sofya Grishkova");
        // ----- Write your code above
    }
}
