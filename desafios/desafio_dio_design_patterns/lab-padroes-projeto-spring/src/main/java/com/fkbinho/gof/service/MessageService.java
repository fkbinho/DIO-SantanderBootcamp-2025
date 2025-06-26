package com.fkbinho.gof.service;

import com.fkbinho.gof.dto.MessageRequest;
import com.fkbinho.gof.dto.MessageResponse;
import com.fkbinho.gof.model.Message;
import com.fkbinho.gof.repository.MessageRepository;
import com.fkbinho.gof.service.factory.MessageStrategyFactory;
import com.fkbinho.gof.service.strategy.MessageStrategy;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService {
    private final MessageRepository repository;
    private final MessageStrategyFactory strategyFactory;

    public MessageService(MessageRepository repository, MessageStrategyFactory strategyFactory) {
        this.repository = repository;
        this.strategyFactory = strategyFactory;
    }

    public MessageResponse send(MessageRequest request) {
        MessageStrategy strategy = strategyFactory.getStrategy(request.getType());
        strategy.send(request.getReceiver(), request.getMessage());

        Message message = new Message();
        message.setReceiver(request.getReceiver());
        message.setContent(request.getMessage());
        message.setType(request.getType());
        message.setSentAt(LocalDateTime.now());

        return new MessageResponse(repository.save(message));
    }

    public List<MessageResponse> getAll() {
        return repository.findAll().stream().map(MessageResponse::new).collect(Collectors.toList());
    }

    public MessageResponse getById(Long id) {
        return repository.findById(id).map(MessageResponse::new)
                .orElseThrow(() -> new RuntimeException("Message not found"));
    }

    public MessageResponse update(Long id, MessageRequest request) {
        Message message = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found"));

        message.setReceiver(request.getReceiver());
        message.setContent(request.getMessage());
        message.setType(request.getType());

        return new MessageResponse(repository.save(message));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
