import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Beatrice Labe Lary
 */
public class RockPaperScissors {

    public static final Scanner KBD = new Scanner(System.in);
    public static final Random RAND = new Random();

    public static void main(String[] args) {
        //variables
        int countWins = 0;
        int countLoses = 0;
        int countTies = 0;
        int countGames = 0;

        //Print the Introduction
        printIntroduction();

        // get user choice
        String playerChoice = getChoiceFromUser();

        // loops until the user the user intput 
        while (!playerChoice.equals("Exit")) {
            //boolean variables
            boolean r1 = playerChoice.equals("Rock");
            boolean r2 = playerChoice.equals("Scissors");
            boolean r3 = playerChoice.equals("Paper");
            boolean r4 = playerChoice.equals("Exit");
            // if condition for valid inputs
            if (r1 || r2 || r3 || r4) {
                // computer choice
                String computerChoice = getRandomChoice();
                System.out.print("Computer choice:" + computerChoice);
                System.out.println();
                //print if player wins or not
                String outcome = determineWinner(playerChoice, computerChoice);
                System.out.println(outcome);
                // if the outcome is win, the win counts increments
                if (outcome.equals("You Win")) {
                    countWins++;
                } else if (outcome.equals("You Lose")) {
                    // if outcome is a loss, the loss count increments
                    countLoses++;
                } else {
                    // if there is a tie, the tie count increases
                    countTies++;
                }
                //counts the number of valid games played
                countGames++;

                // print the stats every 5 games
                if ((countGames % 5) == 0) {
                    System.out.println();
                    System.out.println("After " + countGames + " games:");
                    System.out.println();
                    //call the method to print the stars
                    printStats(countWins, countLoses, countTies);
                    System.out.println();
                }
            } else {
                // when the input is  difference from the listed choices
                System.out.print("Invalid choice. ");
            }
            // update to keep the loop running and stop when the input is Exit
            playerChoice = getChoiceFromUser();
        }
        System.out.println();
        //Print the number of games played
        System.out.println("You played " + countGames + " games, and your"
                + " record is:");
        System.out.println();
        //prints the stats
        printStats(countWins, countLoses, countTies);
        System.out.println();
        System.out.println("Goodbye!");

    }

    /**
     * print an introduction
     */
    public static void printIntroduction() {
        System.out.println("Rock, Paper, Scissors Game");
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("This program plays Rock, Paper, Scissors with the "
                + "user\nuntil they enter the EXIT command.");
        System.out.println();
        System.out.println("Author: Beatrice Labe Lary");

    }

    /**
     * prompt the user to select Rock, Paper, or Scissors.
     *
     * @return
     */
    public static String getChoiceFromUser() {
        System.out.print("Enter your choice (Rock/Paper/Scissors or type "
                + "Exit to end the game):");
        String userChoice;
        userChoice = KBD.nextLine();

        return userChoice;
    }

    /**
     * generates a choice (Rock, Paper, or Scissors) and return it as a String.
     *
     * @return
     */
    public static String getRandomChoice() {

        int computerChoice;
        computerChoice = RAND.nextInt(0, 2);
        if (computerChoice == 1) {
            return "Rock";
        } else if (computerChoice == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    /**
     * determine the winner, and return a String stating the result
     *
     * @param playerChoice
     * @param computerChoice
     * @return
     */
    public static String determineWinner(String playerChoice, String computerChoice) {

        if (playerChoice.equals("Rock")) {
            if (computerChoice.equals("Scissors")) {
                return "You Win";
            } else if (computerChoice.equals("Paper")) {
                return "You Lose";
            } else {
                return "There is a Tie";
            }
        } else if (playerChoice.equals("Paper")) {
            if (computerChoice.equals("Rock")) {
                return "You Win";
            } else if (computerChoice.equals("Scissors")) {
                return "You Lose";
            } else {
                return "There is a Tie";
            }

        } else if (playerChoice.equals("Scissors")) {
            if (computerChoice.equals("Paper")) {
                return "You Win";
            } else if (computerChoice.equals("Rock")) {
                return "You Lose";
            } else {
                return "There is a Tie";
            }
        } else {
            return "false";
        }
    }

    /**
     * take in the total numbers of player’s wins, losses, and ties and print a
     * message
     *
     * @param wins
     * @param losses
     * @param ties
     */
    public static void printStats(int wins, int losses, int ties) {
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties: " + ties);
    }
}
