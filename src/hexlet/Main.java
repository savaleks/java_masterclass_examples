package hexlet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Car.Speed();
        } catch (Exception e) {
            System.out.println("Wrong input");
        }
    }
}

class  Car {

    public static double Speed () throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance, m: ");
        int length = scanner.nextInt();
        System.out.println("Input time, s: ");
        int time = scanner.nextInt();

        double speed = (double) (length/time)*3.6;

        System.out.println("Your speed is " + (speed) + " km/h.");

        if (speed<= 20){
            System.out.println("too slow \nup your speed!");
        } else if (speed < 40) {
            System.out.println("your speed correct");
        } else if (speed >= 40){
            System.out.println("too fast, slow down!");
        }
        return speed;
    }
}
