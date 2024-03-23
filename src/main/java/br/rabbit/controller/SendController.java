package br.rabbit.controller;

import br.rabbit.sender.QueueSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sender")
public class SendController {

    @Autowired
    private QueueSender queueSender;

    @PostMapping
    public ResponseEntity<String> send(@RequestParam String message){
        queueSender.send(message);
        return ResponseEntity.ok("done");
    }

}
