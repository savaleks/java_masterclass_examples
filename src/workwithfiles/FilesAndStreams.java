package workwithfiles;

import java.io.*;
import java.net.URL;

public class FilesAndStreams {

    public static void main(String[] args) throws IOException {

        File file = new File("C:/Users/Alexander/Desktop/hello.txt");
        System.out.println("Mes turime faila " + file.getName());

        System.out.println("Ar mes tikrai turime faila? " + file.exists());


        //iraso teksta i faila;
        String tekstas = "Mano tekstas is java programos.";
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(tekstas.getBytes());
        outputStream.close();

        //grazina rezultata is tekstinio failo i konsole;
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(new FileInputStream(file)));
        String eilute = reader.readLine();
        reader.close();
        System.out.println("Tekstas is failo: \n" + eilute);

        /*
        output
        Mes turime faila hello.txt
        Ar mes tikrai turime faila? true
        Tekstas is failo:
        Mano tekstas is java programos.
         */

//        //gaunam teksta is url;
//        URL url = new URL("http://www.gutenberg.org/cache/epub/25/pg25.txt");
//        InputStream knyga = url.openStream();
//        BufferedReader skaitymas = new BufferedReader(new InputStreamReader(knyga));
//        String text = skaitymas.readLine();
//        while (text != null){
//            System.out.println(text);
//            text = skaitymas.readLine();
//        }
//        System.out.println("*****************");
//        System.out.println("Knyga gauta!");
    }
}
