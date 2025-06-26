package com.fkbinho.gof.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class SmsMessageStrategy implements MessageStrategy {
    @Override
    public void send(String receiver, String message) {
        System.out.println("Sending SMS to " + receiver + ": " + message);
    }
}
