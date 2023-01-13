package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
class DemoController{

    @GetMapping(name = "/test")
    public String test123(){
    log.info("/test api invoked.. ");
    return "smthinhg..";
    }
}
