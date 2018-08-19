package training;

public class Sample1 {
    public static void main(String[] args) {
        int x = 9;
        String cup = "bottle";

        while (x <15) {
            if (x>10&&x<=12) {
                System.out.println("you have " + cup + " number " + x);
                break;
            }
            x++;
            System.out.println("you open " + cup + " number " + x);

        }
    }
}
