package com.lori.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlller{

    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
