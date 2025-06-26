package com.fkbinho.gof.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppMessageStrategy implements MessageStrategy {
    @Override
    public void send(String receiver, String message) {
        System.out.println("Sending WhatsApp message to " + receiver + ": " + message);
    }
}
