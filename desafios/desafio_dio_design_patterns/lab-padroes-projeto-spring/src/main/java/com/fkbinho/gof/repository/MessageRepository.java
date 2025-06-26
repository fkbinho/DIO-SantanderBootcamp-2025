package com.fkbinho.gof.repository;

import com.fkbinho.gof.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
