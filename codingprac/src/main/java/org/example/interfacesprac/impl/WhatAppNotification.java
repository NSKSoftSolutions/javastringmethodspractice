package org.example.interfacesprac.impl;

import org.example.interfacesprac.NotificationService;

public class WhatAppNotification implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {

        System.out.println("Sending a WhatsApps Message to -->" + recipient +"and the Message is -->" + message);

    }
}
