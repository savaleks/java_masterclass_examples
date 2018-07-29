package forloops;
/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message gEnter number:h
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
Bonus:
-Create a project with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean sum = true; // flag first digit true, will be max;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (sum){
                    sum = false; //second digit false, not zero as initialized;
                    min = number;
                    max = number;
                }
                if (number > max) { //if second number will be greater than first, it will be max;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                } else {  // after wrong input program break;
                    break;
                }
                scanner.nextLine(); // after input, if true, start again;
            }
            System.out.println("min = " + min + ", max = " + max);
            scanner.close(); // closing program after result. !important
        }
    }


