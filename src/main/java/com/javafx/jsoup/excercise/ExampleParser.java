package com.javafx.jsoup.excercise;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ExampleParser {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("http://example.com").get();
        String h1 = document.select("h1").first().text();
        String p = document.select("p").first().text();
        System.out.println("Header H1: " + h1);
        System.out.println("First paragraph p: " + p);
    }
}
