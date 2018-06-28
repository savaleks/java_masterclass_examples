package Java_masterclass_lambda;

public class Main {
    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();
        new Thread(()-> System.out.println("Printing from Runnable 2.")).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from Runnable. ");
    }
}
