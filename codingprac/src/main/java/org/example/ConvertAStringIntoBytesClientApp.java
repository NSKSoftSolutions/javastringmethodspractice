package org.example;

import java.nio.charset.Charset;

public class ConvertAStringIntoBytesClientApp {
    public static void main(String[] args) {

        String str = "HELLO";
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }
    }
}
