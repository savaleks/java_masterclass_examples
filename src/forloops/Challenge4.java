package forloops;
/*
Write a method with the name sumDigits that has one int parameter called number.
If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we donft want to process them, also we donft want to process negative numbers,
so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid
and invalid values passed as arguments.
Hint:
	Use n % 10 to extract the least-significant digit.
	Use n = n / 10 to discard the least-significant digit.
	The method needs to be static like other methods so far in the course.
Tip:
	Create a project with the name DigitSumChallenge.
 */

public class Challenge4 {

    public static void main(String[] args) {
        System.out.println("Sum of digits 125 is: " + sumDigits(125));
        System.out.println("Sum of digits -9 is: " +sumDigits(-9));
        System.out.println("Sum of digits 5 is: " +sumDigits(5));
        System.out.println("Sum of digits 5897 is: " +sumDigits(5897));

        System.out.println(sumDouble(891.36));
    }

    public static int sumDigits(int number){
     if (number >= 10){
         int sum = 0;
         while (number>0){
             int digit = number%10;
             sum+=digit;
             number=number/10;
         }
         return sum;

     }
     return -1;
    }

    public static int sumDouble (double number1)
    {
        int temp = (int) (number1 * 100), sum = 0; // gaunam sveika skaiciu (int)
        while (temp > 0)                           // kol daugiau negu nulis
        {
            sum += temp % 10;                      // issiskyrem zenkla is skaiciaus ir sumuojam;
            temp /= 10;                            // sumaziname vienu zenklu
        }
        return sum;                                // rezultatas;
    }
}
