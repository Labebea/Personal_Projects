import java.util.Scanner;

/**
 *
 * @author Beatrice Labe Lary
 */
public class SleepGadget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        Scanner kbd = new Scanner(System.in);
        int choice;
        int age;
        //displaying Intoduction by calling a method 
        displayIntroduction();
        System.out.println();
        //display choices by calling a method
        displayChoices();
        System.out.println();
        //user input
        System.out.print("Your choice: ");
        choice = kbd.nextInt();
        kbd.nextLine();
        //conditon for running the loop
        while (choice != 0) {
            if (choice == 1) {
                System.out.print("How old are you? ");
                age = kbd.nextInt();
                //calling a method to display the recommernded hours of sleep
                findRecommendedHours(age);
            } else if (choice == 2) {
                //calling a method to display the statistics
                calculateSleepStatistics();
            } else if (choice == 0) {
                  //program stops running
            } else {
                System.out.println("Please enter a valid choice "
                        + "number (0-2)");
                System.out.println();
            }
            //update
            displayChoices();
            System.out.print("Your choice: ");
            choice = kbd.nextInt();
        }
        //end of the program
        System.out.println("Sleep is the best medicine; try to get enough"
                + " of it!\nGood bye!");

    }

    /**
     *Prints a introduction
     */
    public static void displayIntroduction() {
        System.out.println("\tSleep Gadget\n\tBy Beatrice Labe Lary");
        System.out.print("Welcome to our sleep app!");
        System.out.println("It will provide you with some fun facts "
                + "regarding your sleep habits!");
        System.out.println();
    }

    /**
     *displays a list of choices for the user
     */
    public static void displayChoices() {
        System.out.println("Here are available choices:");
        System.out.println("\t1. Find recommended hours of sleep");
        System.out.println("\t2. Calculate sleep statistics");
        System.out.println("\t0. Exit");
        System.out.println();
    }

    /**
     *Prompt the user and wait for them to press the enter key.
     */
    public static void pause() {
        Scanner kbd = new Scanner(System.in);
        System.out.println();
        System.out.print("Press Enter...");
        kbd.nextLine();
        System.out.println();
    }

    /**
     *recommend the amount of sleep according to the age
     * @param age
     */
    public static void findRecommendedHours(int age) {
        if (age == 1) {
            System.out.println("You need 12-16 hours of sleep!");
        } else if (age == 2) {
            System.out.println("You need 11-14 hours of sleep!");
        } else if (age >= 3 && age <= 5) {
            System.out.println("You need 10-13 hours of sleep!");
        } else if (age >= 6 && age <= 12) {
            System.out.println("You need 9-12 hours of sleep!");
        } else if (age >= 13 && age <= 18) {
            System.out.println("You need 8-10 hours of sleep!");
        } else if (age >= 19 && age <= 60) {
            System.out.println("You need at least 7 hours of sleep!");
        } else if (age > 60) {
            System.out.println("You need 7-9 hours of sleep!");
        }
        pause();
    }

    /**
     * prompt the user to enter value and calculate statistics
     */
    public static void calculateSleepStatistics() {
        Scanner kbd = new Scanner(System.in);
        double hours, average;
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int count = 0;
        double sum = 0;
        System.out.println("Enter the number of hours you slept in the last "
                + "few days");
        System.out.println("(when you are done enter a negative number):");
        hours = kbd.nextInt();
        while (hours >= 0) {
            sum = sum + hours;
            count++;
            big = (int) Math.max(hours, big);
            small = (int) Math.min(hours, small);

            hours = kbd.nextInt();

        }
        average = sum / count;

        System.out.println("In the last " + count + " days you have slept "
                + average + " hours per day on average!");
        System.out.println("During this time window, you have slept at most "
                + big + " hours and at least "
                + small + " hours and at least ");

        pause();

    }
}
