package forloops;

public class Challenge7 {
    public static void main(String[] args) {
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(-5));

      // printSquareStar(5);
       printSquareStar(5);
    }

//    public static boolean isPerfectNumber(int number){
//        if (number<1){
//            return false;
//        } else {
//            int perfectNumber = 0;
//            for(int i=1;i<=number/2;i++){
//                if(number%i == 0){
//                    perfectNumber += i;
//                }
//            }
//            if(perfectNumber == number){
//                return true;
//            } else {
//                return false;
//            }
//
//        }
//    }


    public static void printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
