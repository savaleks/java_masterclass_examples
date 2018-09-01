package home.training;

/*
Įsivaizduokite analoginį laikrodį. Asmuo įveda valandų ir minučių reikšmes.
Tuomet programa paskaičiuoja kampą tarp rodyklių (mažesnįjį) ir parodo atsakymą.
Programa paleidžiama per konsolę, jokio UI nereikia.
Svarbiausia, kad būtų galima paleidus programą per konsolę pateikti valandų ir minučių reikšmes.
 */

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        //prasom ivesti valandu ir minuciu skaiciu;

        System.out.println("Prasom ivesti valandu ir minuciu skaiciu:");

        int hour;
        int minutes;

        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite valandas(hh): ");
        hour = in.nextInt();

        System.out.println("Iveskite minutes(mm): ");
        minutes = in.nextInt();
        System.out.println("Laikrodyje dabar yra " + hour + ":" + minutes + " val.");

        int hourDegrees = hour * 30;
        int minutesDegrees = minutes * 6;
        int zeroTime = 360 - hourDegrees; //dar lieka nustatyti laipsiu skirtuma jeigu maziau negu 6 val.;
        //turi buti 180-hourDegrees;


        if (minutesDegrees==0){
            System.out.println("Kampas tarp valandu ir minuciu rodykles yra " + zeroTime + "°");
        } else if (hourDegrees>minutesDegrees){
            System.out.println("Kampas tarp valandu ir minuciu rodykles yra " + (hourDegrees-minutesDegrees) + "°");
        } else if (minutesDegrees>hourDegrees){
            System.out.println("Kampas tarp valandu ir minuciu rodykles yra " + (minutesDegrees-hourDegrees) + "°");
        } else if (minutesDegrees==hourDegrees){
            System.out.println("Kampas tarp valandu ir minuciu rodykles yra 0°");
        }
    }
}
