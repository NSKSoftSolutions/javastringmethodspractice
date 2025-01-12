package org.example;

import org.example.interfacesprac.NotificationService;
import org.example.interfacesprac.impl.EmailNotification;
import org.example.interfacesprac.impl.SMSNotification;
import org.example.interfacesprac.impl.WhatAppNotification;

public class NotificationServiceMGMTApp {
    public static void main(String[] args) {
        //BC bc=new DC();

        NotificationService notificationService = new SMSNotification();
        notificationService.sendNotification("Good Morning INDIA", "Indians");
    }


}
