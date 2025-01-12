package org.example.sbuffer;

public class ReversingCharsOfStringBufferClientAPp {
    public static void main(String[] args) {

        StringBuffer stringBuffer=new StringBuffer("Game Changer");
        System.out.println("Before Reversing the Sb-->"+stringBuffer);
        StringBuffer newSb=stringBuffer.reverse();
        System.out.println("After Reversing the Sb-->"+newSb);



    }
}
