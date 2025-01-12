package org.example.interfacesprac.impl;

import org.example.interfacesprac.NotificationService;

public class SMSNotification implements NotificationService {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending a Text Message to -->" + recipient + "and the Message is -->" + message);
    }

}
