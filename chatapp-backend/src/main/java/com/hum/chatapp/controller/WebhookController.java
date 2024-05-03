package com.hum.chatapp.controller;


import com.hum.chatapp.dto.WebHookPayLoad;
import com.hum.chatapp.entity.Message;
import com.hum.chatapp.entity.User;
import com.hum.chatapp.repository.MessageRepository;
import com.hum.chatapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

@RestController
@RequestMapping("/webhook")
@RequiredArgsConstructor
public class WebhookController {

//    @Autowired
//    private ChatMessageService chatMessageService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;
    private final SimpMessagingTemplate messagingTemplate;

    private static final String VERIFY_TOKEN = "12345";
    @GetMapping
    public String handleGetRequest(@RequestParam("hub.mode") String mode,
                                   @RequestParam("hub.verify_token") String token,
                                   @RequestParam("hub.challenge") String challenge) {
        System.out.println("-------------- New Request GEThub.verify_token --------------");

        System.out.println("Body: mode=" + mode + ", token=" + token + ", challenge=" + challenge);

        if ("subscribe".equals(mode) && VERIFY_TOKEN.equals(token)) {
            System.out.println("WEBHOOK_VERIFIED");
            return challenge;
        } else {
            System.out.println("Responding with 403 Forbidden");
            return "403 Forbidden";
        }
    }
    @PostMapping
    public void handlePostRequest(@RequestBody WebHookPayLoad payload) {
//        System.out.println("-------------- New Request POST --------------");

        for (WebHookPayLoad.Entry entry : payload.getEntry()) {

            for (WebHookPayLoad.Messaging messaging : entry.getMessaging()) {

                System.out.println("Message ID: " + messaging.getMessage().getMid());
                System.out.println("Message Text: " + messaging.getMessage().getText());

                System.out.println("Sender ID: " + messaging.getSender().getId());

                System.out.println("Recipient ID: " + messaging.getRecipient().getId());

                long timestamp = messaging.getTimestamp();
                LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
                System.out.println("Time: " + dateTime );

                Message chatMessage= new Message();

                Optional<User> userRecipient = userRepository.findById(messaging.getRecipient().getId());
                if (userRecipient.isPresent()){
                    chatMessage.setReceiver(userRecipient.get());
                }else {
                    User newUser= new User(messaging.getRecipient().getId(),"admin","avatar");
                    userRepository.save(newUser);
                }

                Optional<User> userSender = userRepository.findById(messaging.getSender().getId());
                if (userSender.isPresent()){
                    chatMessage.setReceiver(userSender.get());
                }else {
                    User newUser= new User(messaging.getSender().getId(),"KH","avatar");
                    userRepository.save(newUser);
                }
                chatMessage.setMessage(messaging.getMessage().getText());
                messageRepository.save(chatMessage);
            }
        }

        System.out.println("Body:"+ payload);    }




}
