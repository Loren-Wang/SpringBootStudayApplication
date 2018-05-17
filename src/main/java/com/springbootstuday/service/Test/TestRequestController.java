package com.springbootstuday.service.Test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRequestController {

    @PostMapping("/testtest")
    public String testTest(@RequestParam(name = "name",defaultValue = "宝宝我爱你，么么哒") String name){
        return "宝宝我爱你，么么哒";
    }
}
