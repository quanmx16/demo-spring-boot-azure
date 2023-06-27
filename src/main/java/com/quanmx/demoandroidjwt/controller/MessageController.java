package com.quanmx.demoandroidjwt.controller;

import com.quanmx.demoandroidjwt.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public Message getMessage() {
        Message msg =  new Message();
        msg.setMessage("Hello Quan");
        return msg;
    }
}
