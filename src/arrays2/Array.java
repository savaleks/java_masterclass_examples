package arrays2;

import java.util.Scanner;

public class Array {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] order = getOrder(2);
        for(int i = 0; i<order.length; i++){
            System.out.println("jus ivedete " + order[i]);
        }
        System.out.println("Skaiciu vidurkis yra: " + getAverage(order));
    }

    public static int[] getOrder (int number) {
        System.out.println("Iveskite " + number + " skaicius " + "\r");
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getAverage (int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum/(double)array.length;
    }
}
/*
output
Iveskite 2 skaicius
8
7
jus ivedete 8
jus ivedete 7
Skaiciu vidurkis yra: 7.5
 */
