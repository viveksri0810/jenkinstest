package com.vivek.jenkinstest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {


    @GetMapping("/getmessage")
    public String getMessage(){
        return "Hello!!..  welcome to my page";
    }


    @GetMapping("/junk")
    public Map<String,String> junk(){
        Map<String,String > junkMap=new HashMap<>();
        junkMap.put("first name","vivek");
        junkMap.put("last name", "sri");
        junkMap.put("message","i am junk");
        return junkMap;
    }

}
