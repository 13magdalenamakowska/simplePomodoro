package com.example.pomodoro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/break")
public class BreakModeTimerController {

    @GetMapping
    public void showBreakTimer(){
        System.out.println("Show break.");
    }
}
