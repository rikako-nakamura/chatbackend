package com.rikako.techpit.chat.chatbackend.app.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rikako.techpit.chat.chatbackend.domain.hello.model.Hello;


@RestController
public class HelloController {
  
  @GetMapping("/hello")
  public Hello hello(@RequestParam("name") Optional<String> name) {
    String resName = name.orElse("world!");
    return new Hello("Hello, " + resName);
  }

}

