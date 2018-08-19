package training;

public class Sample2 {
    public static void main(String[] args) {
        String[] wordList1 = {"home", "dog", "sparrow", "256", "7/8"};
        String[] wordList2 = {"boss", "cat", "bird", "999", "5+9"};
        String[] wordList3 = {"apple", "salad", "beer", "mango", "1.25"};

        int oneLength1 = wordList1.length;
        int oneLength2 = wordList2.length;
        int oneLength3 = wordList3.length;

        int rand1 = (int) (Math.random()*oneLength1);
        int rand2 = (int) (Math.random()*oneLength2);
        int rand3 = (int) (Math.random()*oneLength3);

        String phrase = wordList1[rand1] + ", " + wordList2[rand2] + ", " + wordList3[rand3] + ".";

        System.out.println("Compilation random word is: " + phrase);

    }
}
