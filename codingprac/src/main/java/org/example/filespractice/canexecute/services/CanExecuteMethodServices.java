package org.example.filespractice.canexecute.services;

import java.lang.*;
import java.io.File;

public class CanExecuteMethodServices {

    public boolean bacthProcess(String fileName) {
        File file = new File(fileName);
        if (file.canExecute()) {
            System.out.println("You have permission, you read the file");
        } else {
            System.out.println("You don't have permissions");
        }
        return true;
    }

}
