package com.example.JumpSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
   @GetMapping("/hello")
   @ResponseBody // 문자열리턴 없으면 탬플릿 파일을 찾게됨
    public String hello() {
       return "Hello world";
   }
}
