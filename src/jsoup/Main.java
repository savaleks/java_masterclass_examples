package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Document web = Jsoup.connect("https://en.wikipedia.org/wiki/Bubble_sort").get();
        //web.select("p").forEach(System.out::println);
        System.out.println(web.title());
        //System.out.println(web.select("img"));
        Elements element = web.select("a[href]");
//        for (Element pic : element){
//            System.out.println(pic.attr("src"));
//        }

        for (Element name: element) {
            System.out.println(name.text());
        }
    }
}
