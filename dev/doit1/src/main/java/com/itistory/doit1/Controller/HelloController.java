package com.itistory.doit1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "반갑습니다. doit1.tistory.com에 오신것을 환영합니다.";
    }
    @RequestMapping(value="/method", method=RequestMethod.GET)
    public String method() {
        return "method page 수정";
    }
    @RequestMapping(value="/testPage", method=RequestMethod.GET)
    public String findtest() {
        return "findtest 2 자동 빌드 마지막 테스트";
    }
    @GetMapping("/give")
    public String give(){
        return "gite page";
    }
    @GetMapping("/give456456456422")
    public String give22(){
        return "gite22 page";
    }


    @PostMapping("/postMapping")
    public String postMapping(){
        return "post page";
    }
}
