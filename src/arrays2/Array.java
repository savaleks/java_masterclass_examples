package arrays2;

public class Array {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        for (int i = 0; i < array.length; i++) {
                System.out.println("element " + i + " value " + array[i]);
        }
    }
}
/*
output
element 0 value 0
element 1 value 3
element 2 value 6
element 3 value 9
element 4 value 12
 */