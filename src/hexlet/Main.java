package hexlet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car.Speed();
    }
}

class  Car {

    public static double Speed () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance, m: ");
        int length = scanner.nextInt();
        System.out.println("Input time, s: ");
        int time = scanner.nextInt();

        double speed = (double) (length/time);

        System.out.println("Your speed is " + (speed * 3.6) + " km/h.");

        if (speed<= 20){
            System.out.println("too slow");
            if (length < 1000){
                System.out.println("distance too short, measure not precise");
            } else {
                System.out.println("up your speed!");
            }
        } else {
            System.out.println("too fast, slow down!");
        }
        return speed;
    }
}

/*
output
Input distance, m:
800
Input time, s:
62
Your speed is 43.2 km/h.
too slow
distance too short, measure not precise
 */