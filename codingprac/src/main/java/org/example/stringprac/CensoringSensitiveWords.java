package org.example.stringprac;

public class CensoringSensitiveWords {
    public static void main(String[] args) {

        String message = "What the Fuck Are you doing";
        String formatedString = message.replace('u', '*');
        System.out.println(formatedString);

        CharSequence ch1 = "uc";
        String messageFormated = message.replace(ch1, "**");
        System.out.println(messageFormated);

        String comments = "Who Hell are You ?";
        String formattedCommenst = comments.replace("ell", "***");
        System.out.println(formattedCommenst);
    }
}
