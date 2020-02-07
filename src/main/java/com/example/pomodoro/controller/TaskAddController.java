package com.example.pomodoro.controller;

import com.example.pomodoro.data.TaskAddData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/task")
public class TaskAddController {

    @GetMapping
    public String showTask(Model model) {
        model.addAttribute("taskAdd", new TaskAddData());
        return "taskAdd";
    }

    @PostMapping
    public String addTask(
            @Valid @ModelAttribute ("taskAdd") TaskAddData taskAddData,
            BindingResult bindingResult,
            Model model){

        if (bindingResult.hasErrors()){
            return "taskAdd";
        } else {
            model.addAttribute("inputValue", taskAddData.getTask());
            return "taskList";
        }

    }
}
