package com.fkbinho.gof.service.strategy;

public interface MessageStrategy {
    void send(String receiver, String message);
}
