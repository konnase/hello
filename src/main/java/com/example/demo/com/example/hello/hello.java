package com.example.demo.com.example.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class hello {

    @RequestMapping("/love_from_qingping")
    @ResponseBody
    String home() {
        return "胡冰，我爱你！！！";
    }

}