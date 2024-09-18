import java.util.Scanner;

public class RPSLO {

    // Rock = 0, Paper = 1, Scissors = 2, Lizzard = 3, Spock = 4
    // Scissors cut Paper
    // Paper covers Rock
    // Rock crushes Lizard
    // Lizard poisons Spock
    // Spock smashes Scissors
    // Scissors decapitate Lizard
    // Lizard eats Paper
    // Paper disproves Spock
    // Spock vaporizes Rock
    // Rock crushes Scissors

    public static char computerRandom() {
        char computer = 0;
        switch ((int) (Math.random() * (4 - 0) + 0)) {
            case 0:
                computer = 'R'; break;
            case 1:
                computer = 'P'; break;
            case 2:
                computer = 'S'; break;
            case 3:
                computer = 'L'; break;
            case 4:
                computer = 'O'; break;
        }
        System.out.println("Computer play is " + computer);
        return computer;
    }

    public static void gameRPSLO(char computer, String play) {


        if (computer == play.charAt(0)) {
            System.out.println("It's a tie!");
        }
        else {
            if (computer == 'R') {
                if (play.equals("O") || play.equals("P")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if (computer == 'P') {
                if (play.equals("S") || play.equals("L")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if (computer == 'S') {
                if (play.equals("O") || play.equals("R")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if (computer == 'L') {
                if (play.equals("R") || play.equals("S")) {
                    System.out.println("You win!");
                } else {
                    System.out.println( "Computer wins!");
                }
            } else if (computer == 'O') {
                if (play.equals("P") || play.equals("L")) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            }
        }
    }

    public static void main (String[]args){
        System.out.println("Enter your play: R, P, S, L, O");
        Scanner scanner = new Scanner(System.in);
        String play = scanner.nextLine().toUpperCase();
        if (!(play.equals("R") || play.equals("P") || play.equals("S") || play.equals("L") || play.equals("O"))) {
            System.out.println("Invalid input (valid inputs: R, P, S, L, O)");
            return;
        }
        gameRPSLO(computerRandom(), play);

    }
}

