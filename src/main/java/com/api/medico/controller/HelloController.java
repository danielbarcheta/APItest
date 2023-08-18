package com.api.medico.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
        return "Hello";
    }


}
