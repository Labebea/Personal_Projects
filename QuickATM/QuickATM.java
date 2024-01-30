import java.util.Scanner;

/**
 * program that acts as a ATM simulation
 *
 * @author Beatrice Labe Lary 
 */
public class QuickATM {

    public static void main(String[] args) {

        //varaiables
        Scanner kbd = new Scanner(System.in);
        String answer, enteredPin, defaultPin, newPin;
        int balanceAmount, amount, newBalance;
        balanceAmount = 5000;
        defaultPin = "0923";

        //introduction and options
        System.out.println("Welcome to the SimpleATM by N. Neveditsin!");
        System.out.println();
        System.out.println("Choose an option:");
        System.out.println("PIN (Enter PIN)");
        System.out.println("BAL (View Balance)");
        System.out.println("WD (Withdraw)");
        System.out.println("DEP (Deposit)");
        System.out.println("CP (Change PIN)");
        System.out.println("Exit");
        System.out.println();

        //option choice
        System.out.print("Your choice : ");
        answer = kbd.next();
        kbd.nextLine();

        //if choice is pin
        if (answer.equals("PIN")) {

            //tell them to enter PIN
            System.out.print("Please enter your PIN : ");
            enteredPin = kbd.next();
            kbd.nextLine();

            // if PIN is correct
            if (enteredPin.equals(defaultPin)) {
                System.out.println("Authenticated Successfully.");
                System.out.println("Choose an option:");
                System.out.println("BAL (View Balance)");
                System.out.println("WD (Withdraw)");
                System.out.println("DEP (Deposit)");
                System.out.println("CP (Change PIN)");
                System.out.println("Exit");
                System.out.println();

                //option choice
                System.out.print("Your choice : ");
                answer = kbd.next();
                kbd.nextLine();

                //withdrawal
                if (answer.equals("WD")) {
                    System.out.print("Enter amount to withdraw: $");
                    amount = kbd.nextInt();
                    kbd.nextLine();

                    //display new amnount if amount is less than balance
                    if (amount <= balanceAmount) {
                        newBalance = balanceAmount - amount;
                        System.out.println("Withdrawal successful. New balance:"
                                + " $" + newBalance);

                    } else {
                        //if amount is greater than balance
                        System.out.println("Insufficient funds. Exiting...");

                    }
                } else if (answer.equals("CP")) {
                    //change pin
                    System.out.print("Enter your new PIN: ");
                    newPin = kbd.next();
                    kbd.nextLine();

                    //if pin is the same as the previous one 
                    if (newPin.equals(defaultPin)) {
                        System.out.println("PIN unchanged. New PIN should be "
                                + "different from the old one. Exiting...");

                    } else {
                        //if pin is different
                        System.out.println("PIN successfully changed.");

                    }
                } else if (answer.equals("BAL")) {
                    //display the balance
                    System.out.println("Your balance is: $" + balanceAmount);

                } else if (answer.equals("DEP")) {
                    //deposit an amount
                    System.out.print("Enter amount to deposit: $");
                    amount = kbd.nextInt();
                    kbd.nextLine();

                    // display the new balance
                    newBalance = balanceAmount + amount;
                    System.out.println("Deposit successful. New balance: $"
                            + newBalance);

                } else if (answer.equals("Exit")) {

                    // exit
                    System.out.println("Exiting...");
                } else {
                    //Invalid choice
                    System.out.println("Invalid choice.");
                }

            } else {
                //if PIN is incorrect
                System.out.println("Incorrect PIN. Exiting...");
            }
        } else if (answer.equals("BAL")) {
            //display the balance
            System.out.println("Your balance is: $" + balanceAmount);

        } else if (answer.equals("DEP")) {
            System.out.print("Enter amount to deposit: $");
            amount = kbd.nextInt();
            kbd.nextLine();

            // display the new balance
            newBalance = balanceAmount + amount;
            System.out.println("Deposit successful. New balance: $"
                    + newBalance);

        } else if (answer.equals("WD")) {
            //Unauthenticated operation
            System.out.println("You are not authenticated to perform this "
                    + "operation");

        } else if (answer.equals("CP")) {
            //Unauthenticated operation
            System.out.println("You are not authenticated to perform this "
                    + "operation");

        } else if (answer.equals("Exit")) {
            // exit
            System.out.println("Exiting...");

        } else {
            //Invalid choice
            System.out.println("Invalid choice.");

        }
        //greetings
        System.out.println("Thanks for using QuickATM. See you next time!");

    }

}
