package com.alibaba.cloud.ai.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    @PostMapping("/")
    public String index() {
        return "index";
    }


}
