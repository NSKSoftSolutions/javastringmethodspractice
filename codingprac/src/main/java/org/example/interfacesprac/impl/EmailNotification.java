package org.example.interfacesprac.impl;

import org.example.interfacesprac.NotificationService;
import org.example.interfacesprac.PaymentGateWay;

public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + " -->" + message);
    }
}
