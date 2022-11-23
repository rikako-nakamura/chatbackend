package com.rikako.techpit.chat.chatbackend.domain.messages.service;

import java.util.List;
import java.util.Optional;

import com.rikako.techpit.chat.chatbackend.domain.messages.model.Message;

public interface MessageRepository {
  void insert(Message message);

  List<Message> find(int channelId, Optional<String> searchWord);
}