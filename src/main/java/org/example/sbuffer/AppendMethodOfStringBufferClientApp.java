package org.example.sbuffer;

public class AppendMethodOfStringBufferClientApp {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Good Morning");
        System.out.println(stringBuffer.append("Team !"));
        StringBuffer sb1=stringBuffer.append(123);
        System.out.println(sb1);
    }


}
