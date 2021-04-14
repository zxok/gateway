package com.smart.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ApiController {
    @GetMapping("/list")
    public String list() {
        return "用户接口";
    }
}
