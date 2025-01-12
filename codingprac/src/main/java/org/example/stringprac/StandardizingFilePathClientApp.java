package org.example.stringprac;

public class StandardizingFilePathClientApp {
    public static void main(String[] args) {

        String filePath = "c:\\user\\documents\\data";
        String newFilePath = filePath.replace('\\', '/');
        System.out.println(newFilePath);
    }
}
