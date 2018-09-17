package io.samples;

import java.io.*;

public class Sample1 {
    public static void main(String[] args) throws IOException {
        char a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Iveskite simbolius, 'q' -  jeigu norite iseiti.");
        do {
            a = (char) br.read();
            System.out.println(a);
        } while (a != 'g');
    }
}
