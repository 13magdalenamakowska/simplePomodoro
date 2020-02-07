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

@Controller
@RequestMapping("/choiceButtons")
public class PomodoroChoiceButtonsController {

    @GetMapping
    public String showPomodoroChoiceButtons(Model model){
        System.out.println("Show Pomodoro choice buttons.");
        model.addAttribute("choiceButtons", new PomodoroChoiceButtonsData());
        return "choiceButtons";
    }

    @PostMapping
    public String showChoiceData(
        @Valid @ModelAttribute("choiceButtons") PomodoroChoiceButtonsData pomodoroChoiceButtonsData,
                BindingResult bindingResult,
                Model model){

        if (bindingResult.hasErrors()){
            return "choiceButtons";
        } else {
            model.addAttribute("inputWork", pomodoroChoiceButtonsData.getWork());
            model.addAttribute("inputBreak", pomodoroChoiceButtonsData.getBreake());
            return "work";
        }
    }
}
