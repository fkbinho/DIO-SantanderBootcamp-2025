package com.fkbinho.gof.service.factory;

import com.fkbinho.gof.service.strategy.EmailMessageStrategy;
import com.fkbinho.gof.service.strategy.MessageStrategy;
import com.fkbinho.gof.service.strategy.SmsMessageStrategy;
import com.fkbinho.gof.service.strategy.WhatsAppMessageStrategy;
import org.springframework.stereotype.Component;

@Component
public class MessageStrategyFactory {
    private final EmailMessageStrategy email;
    private final SmsMessageStrategy sms;
    private final WhatsAppMessageStrategy whatsapp;

    public MessageStrategyFactory(
            EmailMessageStrategy email,
            SmsMessageStrategy sms,
            WhatsAppMessageStrategy whatsapp
    ) {
        this.email = email;
        this.sms = sms;
        this.whatsapp = whatsapp;
    }

    public MessageStrategy getStrategy(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> email;
            case "SMS" -> sms;
            case "WHATSAPP" -> whatsapp;
            default -> throw new IllegalArgumentException("Invalid type: " + type);
        };
    }
}
