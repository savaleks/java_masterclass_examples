package exceptions;

public class Sample1 {
    public static void main(String[] args) {
        int array[] = {5,6,45};
        int num1 = 13;
        int num2 = 2;
        int result;

        try {
            result = num1/num2;
            System.out.println("The result is " + result);

            for (int i=2; result>=0; i--) {
                System.out.println("Array value is " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error" + e);
        } catch (ArithmeticException e){
            System.out.println("Can't divide by zero " + e);
        }
    }
}
