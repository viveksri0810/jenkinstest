package com.vivek.jenkinstest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @GetMapping("/getmessage")
    public String getMessage(){
        return "Hello!!..  welcome to my page";
    }

}
