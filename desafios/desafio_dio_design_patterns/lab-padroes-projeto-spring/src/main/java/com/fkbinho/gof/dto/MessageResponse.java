package com.fkbinho.gof.dto;

import com.fkbinho.gof.model.Message;

import java.time.LocalDateTime;

public class MessageResponse {
    private Long id;
    private String receiver;
    private String content;
    private String type;
    private LocalDateTime sentAt;

    public MessageResponse(Message message) {
        this.id = message.getId();
        this.receiver = message.getReceiver();
        this.content = message.getContent();
        this.type = message.getType();
        this.sentAt = message.getSentAt();
    }

    public Long getId() {
        return id;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }
}
