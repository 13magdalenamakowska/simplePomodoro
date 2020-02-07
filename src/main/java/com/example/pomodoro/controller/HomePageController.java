package com.example.pomodoro.controller;

import com.example.pomodoro.data.PomodoroChoiceButtonsData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/home")
public class HomePageController {

    @GetMapping
    public String showMenu() {
        System.out.println("Home page.");
        return "homePage";
    }






}
