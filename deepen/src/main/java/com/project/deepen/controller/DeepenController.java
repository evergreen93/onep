package com.project.deepen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeepenController {
    @RequestMapping("/deepen/wwww")
    public String test() {
        return "qwe";
    }
}
