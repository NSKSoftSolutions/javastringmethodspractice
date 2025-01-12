package org.example.sbuffer;

public class StringBufferClientApp {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println("Capacity of StringBuffer-->" + sb.capacity());

        StringBuffer sb1 = new StringBuffer(100);
        System.out.println("Capacity of String Buffer --->" + sb1.capacity());

        String s1 = "Hello, EveryOne Welcome to JavaProgramming";
        StringBuffer sb2 = new StringBuffer(s1);
        System.out.println("Capacity of String Buffer --->" + sb2.capacity());

        char[] ch = {'H', 'E', 'L', 'L', 'I', 'N', 'C', 'E', 'L', 'L'};
        StringBuffer sb3 = new StringBuffer(ch.toString());
        System.out.println(sb3.capacity());


    }


}
