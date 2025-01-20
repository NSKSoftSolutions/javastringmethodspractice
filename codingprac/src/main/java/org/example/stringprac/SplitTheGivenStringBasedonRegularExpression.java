package org.example.stringprac;

public class SplitTheGivenStringBasedonRegularExpression {

    public static void main(String[] args) {

        String str = "Hello,world,welcome,to,java,programing";
        String[] subStrings = str.split("\\,");
        for (int i = 0; i < subStrings.length; i++) {
            System.out.println(subStrings[i]);
        }
    }
}