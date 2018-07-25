package forloops;

// Create a for statement using any range of numbers
// Determine if the number is a prime number using the isPrime method
// if it is a prime number, print it out AND increment a count of the
// number of prime numbers found
// if that count is 3 exit the for loop
// hint:  Use the break; statement to exit

public class Challenge1 {

    public static void main(String[] args) {

        int count = 0;                           // sukuriam kintamaji ir initializuojam;
        for (int i = 10; i < 50; i++) {          //nurodom intervale kur ieskoti pirminius skaicius;
            if (isPrime(i)) {                    //iskvieciam metoda kuris apskaiciuoja ar skaicius yra pirminis;
                count++;                         //po kiekvieno ciklo padidinam skaiciu vienetu;
                System.out.println("Number " + i + " is a prime number");
                if (count == 5) {                //nurodom kiek isvesti elementu is ciklo;
                    System.out.println("Exiting for loop");
                    break;                      //reikia nutraukti procesa kad neivyktu klaidos;
                }
            }
        }
    }
    // metodas apskaiciuoja pirminius skaicius t.y. turi dalintis tik is saves ir vieneto;
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }return true;
    }
}


