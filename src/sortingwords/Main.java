package sortingwords;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        countWords();
    }


    public static void countWords() {
        String textFileLocation = "C:/Users/Alexander/Desktop/hello.txt";
        String readWords = "";
        ArrayList<String> extractOnlyWordsFromTextFile = new ArrayList<>();
        // excludedSymbols can be extended to whatever you want to exclude from the file
        String[] excludedSymbols = {" ", ",", ".", "/", ":", ";", "<", ">"};
        String readByteCharByChar = "";
        boolean testIfWord = false;


        try {
            InputStream inputStream = new FileInputStream(textFileLocation);
            byte byte1 = (byte) inputStream.read();
            while (byte1 != -1) {

                readByteCharByChar += String.valueOf((char) byte1);
                for (int i = 0; i < excludedSymbols.length; i++) {
                    if (readByteCharByChar.equals(excludedSymbols[i])) {
                        if (!readWords.equals("")) {
                            extractOnlyWordsFromTextFile.add(readWords);
                        }
                        readWords = "";
                        testIfWord = true;
                        break;
                    }
                }
                if (!testIfWord) {
                    readWords += (char) byte1;
                }
                readByteCharByChar = "";
                testIfWord = false;
                byte1 = (byte) inputStream.read();
                if (byte1 == -1 && !readWords.equals("")) {
                    extractOnlyWordsFromTextFile.add(readWords);
                }
            }
            inputStream.close();
            System.out.println(extractOnlyWordsFromTextFile);
            System.out.println("The number of words in the choosen text file are: " + extractOnlyWordsFromTextFile.size());
        } catch (IOException ioException) {

            ioException.printStackTrace();
        }
    }
}


