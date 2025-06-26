package com.fkbinho.gof.service.strategy;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageStrategy implements MessageStrategy {
    @Override
    public void send(String receiver, String message) {
        System.out.println("Sending EMAIL to " + receiver + ": " + message);
    }
}
