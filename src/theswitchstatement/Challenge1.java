package theswitchstatement;

public class Challenge1 {
    public static void main(String[] args) {

        char letter = 'F';

        switch (letter){
            case 'A':
                System.out.println("a");
                break;
            case 'B':
                System.out.println("b");
                break;
            case 'C':
                System.out.println("c");
                break;
            case 'D':
                System.out.println("d");
                break;
            case 'E':
                System.out.println("e");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}
// output 'not found'.
