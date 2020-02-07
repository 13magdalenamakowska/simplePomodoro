package com.example.pomodoro.controller;

import com.example.pomodoro.data.PomodoroChoiceButtonsData;
//import com.example.pomodoro.model.WorkTimer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/work")
public class WorkModeTimerController {

    @GetMapping
    public void showWorkTimer(){
        System.out.println("Show work.");
        LocalTime work1 = LocalTime.now();
        System.out.println(work1);
    }

}
