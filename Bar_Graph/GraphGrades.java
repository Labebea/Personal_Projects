package a04;

import java.util.Scanner;

/**
 * program that reads in grades and print a bar graph of their distribution.
 *
 * @author Beatrice Labe Lary 
 */
public class GraphGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variables
        Scanner kbd = new Scanner(System.in);
        int grade, count1, count2, count3, count4;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;

        //Intoduction
        System.out.println("Grade Distribution");
        System.out.println("------------------");
        System.out.println();
        System.out.println("This program prints a bar graph showing the"
                + " distribution of grades in a class.");
        System.out.println();
        System.out.println("By Beatrice Labe Lary ");
        System.out.println();
        System.out.print("...press enter...");
        kbd.nextLine();
        System.out.println();
        //User enter the grades
        System.out.println("Enter the grades below, ending with a negative"
                + " number:");
        grade = kbd.nextInt();
        //If grade is less than zero, loop stops
        
        while (grade >= 0) {
            if (grade >= 80) {
                //counts the number of grades less or equal to 80
                count1++;
            } else if (grade >= 70 & grade <= 79) {
                //counts the number of grades between 70 and 79
                count2++;
            } else if (grade >= 60 & grade <= 69) {
                //counts the number of grades between 60 and 69
                count3++;
            } else if (grade < 60) {
                //counts the number of grades less than 60
                count4++;
            }

            grade = kbd.nextInt();
        }
        //
        System.out.println();
        System.out.print("...press enter...");
        kbd.nextLine();
        kbd.nextLine();
        System.out.println();
        //print the graph
        System.out.println("Distribution");
        System.out.println();
        //output a graph for grades above and equal to 80
        System.out.print("80+   |");
        for (int i = 0; i < count1; ++i) {
            System.out.print("*");
        }
        System.out.println();
        //output a graph for grades between 70 and 79
        System.out.print("70-79 |");
        for (int j = 0; j < count2; ++j) {
            System.out.print("*");
        }
        System.out.println();
        //output a graph for grades between 60 10 69
        System.out.print("60-69 |");
        for (int k = 0; k < count3; ++k) {
            System.out.print("*");
        }
        System.out.println();
        //output a graph for grades less than 60
        System.out.print(" 0-59 |");
        for (int l = 0; l < count4; ++l){
           System.out.print("*"); 
        }
        System.out.println();
        System.out.println();
        //press enter to end the program
        System.out.print("...press enter...");
        kbd.nextLine();

    }

}
