package org.example.client;

import org.example.services.UrlParserServices;

public class UrlParserClientApp {
    public static void main(String[] args) {


        UrlParserServices urlParserServices=new UrlParserServices();
        urlParserServices.segerigateUrl("https://www.navabitsolutions.com/Java8");


    }
}
