package theswitchstatement;
/*
Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
The method should not return any value (hint: void)
Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively,
 otherwise it should print gInvalid dayh.
Bonus:
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh
*/
public class Challenge3 {

    public static void main(String[] args) {
        // printDayOfTheWeek(9);
//        //  printNumberInWord(10);
//        System.out.println(isLeapYear(-1600));
//        System.out.println(isLeapYear(1600));
//        System.out.println(isLeapYear(2017));
//        System.out.println(isLeapYear(2000));
//        System.out.println(getDayInMonth(1, 2020));
//        System.out.println(getDayInMonth(2, 2020));
//        System.out.println(getDayInMonth(2, 2018));
//        System.out.println(getDayInMonth(-1, 2020));
//        System.out.println(getDayInMonth(1, -2020));
//        System.out.println(getDayInMonth(22,1970));
    }

//    private static void printDayOfTheWeek(int day) {
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wendesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }
//    }

//    public static void printNumberInWord(int number){
//        switch(number){
//            case 0:
//                System.out.println("ZERO");
//                break;
//            case 1:
//                System.out.println("ONE");
//                break;
//            case 2:
//                System.out.println("TWO");
//                break;
//            case 3:
//                System.out.println("THREE");
//                break;
//            case 4:
//                System.out.println("FOUR");
//                break;
//            case 5:
//                System.out.println("FIVE");
//                break;
//            case 6:
//                System.out.println("SIX");
//                break;
//            case 7:
//                System.out.println("SEVEN");
//                break;
//            case 8:
//                System.out.println("EIGHT");
//                break;
//            case 9:
//                System.out.println("NINE");
//                break;
//            default:
//                System.out.println("OTHER");
//        }
//    }

//    public static boolean isLeapYear(int year) {
//        if ((year >= 1 && year <= 9999) && ((year % 4 == 0&&year%100!=0) || (year % 400 == 0))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static int getDayInMonth(int month, int year) {
//        if (isLeapYear(year)) {
//            switch (month) {
//                case 1:
//                    return 31;
//                case 2:
//                    return 29;
//                case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 3:
//                    return 31;
//                default:
//                    return -1;
//            }
//        }else if ((month>1&&month<12)&&(year >= 1 && year <= 9999)){
//            switch (month){
//                case 1:
//                    return 31;
//                case 2:
//                    return 28;
//                case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 3:
//                    return 31;
//                default:
//                    return -1;
//            }
//        }return -1;
//    }
}