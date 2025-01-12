package org.example.services;

public class UrlParserServices {

    //Let say we have a url and we want to seperate the baseUrl and resourcePath

    public void segerigateUrl(String url) {

        int lastIndex = url.lastIndexOf("/");

        String baseUrl = url.substring(0, lastIndex);
        String resource = url.substring(lastIndex + 1);

        System.out.println("Url is --->" + url);
        System.out.println("Segrated the Given URL");
        System.out.println("baseUrl -->" + baseUrl);
        System.out.println("resource Path -->" + resource);

    }


}
