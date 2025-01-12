package org.example;

public class CountTheCharsClientApp {
    public static void main(String[] args) {


        //write a program to findout the occurences of each char
        String str = "HELLO";
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];
        int i;


        for (i = 0; i < ch.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Given Char--> " + ch[i] + "-->is repeated-->" + count);
        }


    }

}
