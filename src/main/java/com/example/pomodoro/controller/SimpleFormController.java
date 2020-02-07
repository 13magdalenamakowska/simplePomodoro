package com.example.pomodoro.controller;

import com.example.pomodoro.data.SimpleFormLogData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class SimpleFormController {

    @GetMapping
    public String showLog(Model model){
        model.addAttribute("formLog", new SimpleFormLogData());
        return "simpleFormLog";
    }

    @PostMapping
    public String showFormLog(
            @Valid @ModelAttribute("formLog") SimpleFormLogData simpleFormLogData,
            BindingResult bindingResult,
            Model model){

        if (bindingResult.hasErrors()){
            return "simpleFormLog";
        } else {
            model.addAttribute("inputLogin", simpleFormLogData.getLogin());
//            model.addAttribute("inputValue", simpleFormLogData.getPhone());
            model.addAttribute("inputValue", simpleFormLogData.getPassword());
            return "userInputLog";
        }
    }

}
