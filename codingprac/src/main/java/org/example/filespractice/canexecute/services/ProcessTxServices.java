package org.example.filespractice.canexecute.services;

import java.io.*;

public class ProcessTxServices {

    public void processTx(String fileName) {
        File file = new File(fileName);
        file.setExecutable(false);
        if (file.canExecute()) {
            System.out.println("We have neccessary Permissions");
            System.out.println("we can Process the Tx");
        } else {
            System.out.println("Permissions Denied");
        }
    }


}
