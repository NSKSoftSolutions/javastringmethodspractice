package org.example.services;

public class EmailServices {

    public static  final String EMAIL_TEMPLATE="Hello {{name}},\n" +
            "\n" +
            "Your appointment is scheduled for {{date}}.\n" +
            "\n" +
            "Thank you,\n" +
            "Customer Support\n";
    public void mailAuthentication(String email) {
        int indexNumber;
        if ((email.indexOf('@')) != -1) {
            System.out.println("Email is Autheticated Successfully");
        }
    }

    public String createEmail(String userName) {
        String formattedString = String.format(userName, 123);
        System.out.println(formattedString);
        return formattedString;
    }

    public String emailTemplate(String emailTemplate, String name, String date) {
        String formattedTemplate = emailTemplate.replace("{{name}}", name).replace("{{date}}", date);
        return formattedTemplate;
    }
}
