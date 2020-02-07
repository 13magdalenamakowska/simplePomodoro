package com.example.pomodoro.controller;

import com.example.pomodoro.data.FormRegData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class FormRegistrationController {

    @GetMapping
    public String showFormRegistration(Model model){
        model.addAttribute("formReg", new FormRegData());
        return "formReg";
    }

    @PostMapping
    public String showFormReg(
            @Valid @ModelAttribute("formReg") FormRegData formRegData,
            BindingResult bindingResult,
            Model model){

        if (bindingResult.hasErrors()){
            return "formReg";
        } else {
            model.addAttribute("inputValue", formRegData.getFirstName());
            model.addAttribute("inputValue", formRegData.getLastName());
            model.addAttribute("inputValue", formRegData.getEmail());
            model.addAttribute("inputValue", formRegData.getLogin());
            model.addAttribute("inputValue", formRegData.getPassword());
            return "userInputReg";
        }
    }
}
