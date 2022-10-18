package com.classattendance.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/ClassAttendance")
public class WebController {
    @GetMapping(path = "")
    public String index(){
        return "index.html";
    }
}
