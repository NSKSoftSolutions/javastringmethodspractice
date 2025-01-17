package org.example.stringprac;

public class WebsiteWithVipContactNumbers {


    //your are working on an application where phoneNumbers are stored in various formats, mask the
    //area code... and we have display the masked phoneNumbers
    private static final String DEFALUT_REGEX = "\\d{3}";

    public String formattingPhoneNumbers(String inputString, String repalcement) {
        return inputString.replaceFirst(DEFALUT_REGEX, repalcement);
    }

}
