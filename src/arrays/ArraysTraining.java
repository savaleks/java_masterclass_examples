package arrays;

public class ArraysTraining {
    public static void main(String[] args) {

        int[] myArrays = new int[20];

        for (int i = 0; i < myArrays.length; i=i+3) {
            myArrays[i] = i * 5;
        }
        for (int i = 0; i < myArrays.length; i=i+3) {
            myArrays[i] += 5-3;
            System.out.println("Element " + i + " value is " + myArrays[i]);
        }
    }
}
