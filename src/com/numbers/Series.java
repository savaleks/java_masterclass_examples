package com.numbers;

public class Series {

    public static long nSum(int n){ // metodai turi buti statiniai kad galima butu prieiti is .jar failo;
       return (n*(n+1))/2;
    }
    // factorialai
    public static long factorial (int n) {
        if (n==0){
            return 1;
        }
        long fact = 1; //inicializuojam kintamaji 'fact';
        for (int i=1; i <= n; i++){
            fact*=i;
        }
        return fact;
    }
    //fibonacci skaiciai
    public static long fibonacci(int n){
        if (n==0){
            return 0;
        } else if (n==1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i=1; i<n; i++){
            fib=(nMinus2 + nMinus1);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
// po to sukuriam .jar faila File -> Project structure -> Artifacts -> + ->...

// po to sukuriam nauja paketa, pridedam sukurta .jar faila ir panaudojam 'static method' gauti rezultata;
//pvz. apacioje;

//package com.example.test;
//
//        import com.numbers.Series; // importuojam paketa is Series clases, kad pasiekti metodus;
//
//public class Main {
//
//    public static void main(String[] args) {
//        for (int i=0; i<=10; i++){
//            System.out.println(Series.nSum(i));
//        }
//        System.out.println("++++++++++++++++++");
//        for (int i=0; i<=10; i++){
//            System.out.println(Series.factorial(i));
//        }
//        System.out.println("++++++++++++++++++");
//        for (int i=0; i<=10; i++){
//            System.out.println(Series.fibonacci(i));
//        }
//    }
//}