package com.learn.mall.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController {
    @GetMapping("welcome")
    public @ResponseBody Object welcome(){
        return "welcome";
    }

    @GetMapping("/level/1")
    public @ResponseBody Object level1(){
        return "level1";
    }

    @GetMapping("/level/2")
    public @ResponseBody Object level2(){
        return "level2";
    }

    @GetMapping("/")
    public @ResponseBody Object mainPage(){
        return "首页";
    }
}
