package com.example.JumpSpring.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //생성자 자동으로 만들어줌
@Getter
public class HelloLombok {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
       HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
