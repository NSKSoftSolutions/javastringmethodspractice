package org.example.threadoperations;
import java.util.Scanner;
//there is webserver that has a thread which needs to handle the incoming requests, During the maitanance, we will
//stopping all the processes temp
public class Maintanance extends Thread {

    private boolean maintanceMode;
    Scanner scanner=new Scanner(System.in);
    public void run() {

        while (true) {
            System.out.println("Is the Server is Running or in Maintaiance mode choose yes or no");
            maintanceMode=scanner.next().equals("yes");
            if (maintanceMode) {
                System.out.println("Server is under the Mainatanance mode, we are not acceppting any request as of now");
                try {
                    suspend();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
            System.out.println("Processing the Request...");
        }

    }


}
