package org.example.filespractice.canexecute.services.canexecute.client;

import org.example.filespractice.canexecute.services.ProcessTxServices;

public class ProcessTxClientApp {
    public static void main(String[] args) {

        ProcessTxServices txServices = new ProcessTxServices();
        txServices.processTx("D:\\filespractice\\newfolder1\\process_transactions.sh");


    }

}
