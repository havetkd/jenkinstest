package com.itistory.doit1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "반갑습니다. doit1.tistory.com에 오신것을 환영합니다.";
    }
    @RequestMapping(value="/method", method=RequestMethod.GET)
    public String method() {
        return "method page 테스트 화면 설정";
    }
    @RequestMapping(value="/testpage", method=RequestMethod.GET)
    public String testpage() {
        return "testpage 테스트 화면 설정 화면에 오신것 환영합니다";
    }
}