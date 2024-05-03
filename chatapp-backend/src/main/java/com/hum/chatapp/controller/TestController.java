package com.hum.chatapp.controller;

import com.hum.chatapp.facebook.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {
    @Autowired
    private FacebookService facebookService;

    @GetMapping("/test")
    public ResponseEntity<?> getChatHomePage() throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body("Hello Omni-chanel");
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> saveUserFacebook(@PathVariable("id") String id) throws Exception {

        facebookService.saveUserForFacebookId(id);
        return ResponseEntity.status(HttpStatus.OK).body("Hello Omni-chanel");
    }
}
