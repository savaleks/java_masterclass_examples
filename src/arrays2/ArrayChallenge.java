package arrays2;

import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(4); //galim pakeisti ivedamu skaiciu dydi;
        int[] sorted = sortIntegers(array);
        printArray(sorted);

    }
    //metodas kuris praso ivesti skaicius i konsole;
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " numbers \r");
        int[] value = new int[number];

        for(int i=0; i<value.length; i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }
    //metodas kuris grazina rezultata;
    public static void printArray(int[] newArray){
        for(int i=0; i<newArray.length; i++){
            //pradeda skaiciuoti nuo 1 (i+1);
            System.out.println("Element " + (i+1) + " = " + newArray[i]);
        }
    }
    //metodas kuris rusiuoja gautus skaicius;
    public static int[] sortIntegers (int[] newArray){
        int[] sortedArray = new int[newArray.length];
        for (int i=0; i<newArray.length; i++){
            sortedArray[i] = newArray[i];
        }
        boolean mark = true;
        int temp;
        while (mark){
            mark = false;
            for(int i=0; i<sortedArray.length-1; i++){
                //lygina skaicius ir rusiuoja pagal mazejancia tvarka
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    mark = true;
                }
            }
        }
        return sortedArray;
    }
}
/*
output
Enter 4 numbers
7
5
1
9
Element 1 = 9
Element 2 = 7
Element 3 = 5
Element 4 = 1
 */