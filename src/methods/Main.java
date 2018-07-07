package methods;

public class Main {
    public static void main(String[] args) {
        // kompiuterio operatyviojoje atmintyje sukuriame nuoroda i instance Car class
        Car car = new Car();
        // nustatome reiksme 20 (inside heap);
        car.maxSpeed = 20;
        // paleidome metoda;
        car.startEngine();

        int speed = 12;
        car.setSpeed(10);
        car.setSpeed(speed);

    }
}
