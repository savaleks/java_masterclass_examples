package forloops;

public class Challenge5 {

    public static void main(String[] args) {
        //       System.out.println(isPalindrome(7017));
        // System.out.println(sumFirstAndLastDigit(-25926));
        //System.out.println(getEvenDigitSum(-9748));
//        System.out.println(hasShareDigit(12,23));
//        System.out.println(hasShareDigit(9,99));
//        System.out.println(hasShareDigit(15,55));
    }

//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int lastDigit = 0;
//        int temp = number;
//        while (number != 0) {
//            lastDigit = number % 10; //gaunam pirma skaiciu nuo galo;
//            reverse = (reverse * 10) + lastDigit; //sukuriame palindrome is skaiciaus
//            number /= 10; //sumazinom skaiciu vienu zenklu ir pradedam is naujo;
//        }
//        if (reverse == temp) {  //lyginame skaicius;
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static int sumFirstAndLastDigit(int number) {
//        int lastDigit = 0;
//        if (number < 0) {
//            return -1;
//        } else {
//            lastDigit = number % 10;                     // the last (least significant digit)
//            if (number > lastDigit) {                    // only numbers with multiple digits will be handled
//                while(number >= 10) {                    // loop until you find the first (most significant) digit
//                    number = number / 10;
//                }
//            }
//        }return lastDigit + number;
//    }

//    public static int getEvenDigitSum(int number) {
//        int evenDigit = 0;
//        int sum = 0;
//        if (number < 0) {
//            return -1;
//        } else {
//            while (number > 0) {
//                evenDigit = number % 10;
//                if (evenDigit % 2 == 0) {
//                    sum = sum + evenDigit;
//                }
//                number = number / 10;
//            }
//            return sum;
//        }
//    }

//    public static boolean hasShareDigit(int x, int y){
//        while ((x>=10&&x<=99)&&(y>=10&&y<=99)){
//            if (((x/10==y/10)||(x/10==y%10))||((x%10==y/10)||(x%10==y%10))){
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }
}

