package org.example.services;

public class FormatStringServcies {

    public static final String DEFAULT_MESSAGE="Good Morning %s";
    public String greeting(String name){
        return String.format(DEFAULT_MESSAGE,name);
    }

}
