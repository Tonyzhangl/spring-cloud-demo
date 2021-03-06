package com.kirago.sc.microserviceconsumermovie.controller;

import com.kirago.sc.microserviceconsumermovie.client.UserFeginClient;
import com.kirago.sc.microserviceconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {


    @Autowired
    private UserFeginClient userFeginClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userFeginClient.findById(id);
    }
}
