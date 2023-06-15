package com.example.shablon11test.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Control
{
    @GetMapping("/")
    public  String index()
    {
        return "index.html";
    }
}
