package io.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[50];
        System.out.println("Iveskite jums patinkancius sakinius");
        System.out.println("Iveskite 'stop' kad uzbaigti programa.");
        for (int i = 0; i<50; i++){
            str[i] = br.readLine();
            if (str[i].equals("stop")){
                break;
            }
        }
        System.out.println("\n***** Jusu faile yra: *****");
        for (int i = 0; i<50; i++){
            if (str[i].equals("stop")){
                break;
            }
            System.out.println(str[i]);
        }
    }

}
