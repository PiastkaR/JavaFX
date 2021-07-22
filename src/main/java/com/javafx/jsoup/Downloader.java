package com.javafx.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Downloader {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://wykop.pl");
//        InputStream inputStream = url.openStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//
//        String line = null;
//        while ((line = bufferedReader.readLine()) != null){
//            System.out.println(line);
//        }
//
//        bufferedReader.close();
        Document document = Jsoup.connect("https://wykop.pl").get();
        Elements h2Elements = document.select("h2");
        for(Element h2 : h2Elements){
            String text = h2.text();
            String h2Url = h2.select("a").first().attr("href");
            System.out.println(text + " :::: " + h2Url);
        }
    }
}
