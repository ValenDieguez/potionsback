package com.mvpigs.potionsback.controller;


import java.util.concurrent.atomic.AtomicLong;

import com.mvpigs.potionsback.Classes.User;
import org.springframework.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class controllerUser {
    private static final User template = new User();
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/login")
    public User user(@RequestParam(value="name", defaultValue="World") String name) {
        return new User(String.format(template,name),
                String.format(template, pass), String.format(template, email));
    }

}
