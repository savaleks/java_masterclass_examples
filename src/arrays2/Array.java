package arrays2;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] order = getOrder(2);
        for(int i = 0; i<order.length; i++){
            System.out.println("jus ivedete " + order[i]);
        }
    }

    public static int[] getOrder (int number) {
        System.out.println("Iveskite " + number + " skaicius " + "\r");
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }
}
/*
output
Iveskite 2 skaicius
4                       //ivedam pirma skaiciu
8                       //ivedam antra skaiciu
jus ivedete 4
jus ivedete 8
 */
