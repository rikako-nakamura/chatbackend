package com.rikako.techpit.chat.chatbackend.domain.channels.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rikako.techpit.chat.chatbackend.domain.channels.model.Channel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChannelDomainService {
  
  private final ChannelRepository channelRepository;

  public Channel create(Channel channel){

    var currentMaxId = channelRepository.getMaxId();
    var newid = currentMaxId.orElse(0) + 1;
    channel.setId(newid);

    channelRepository.insert(channel);
    return channel;
  }

  public List<Channel> findAll(){
    return channelRepository.findAll();
  }

  public Channel update(Channel channel){
    channelRepository.update(channel);
    return channel;
  }

  public void delete(int id){
    channelRepository.delete(id);
  }
}
