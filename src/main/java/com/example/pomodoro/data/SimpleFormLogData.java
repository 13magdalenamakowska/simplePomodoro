package com.example.pomodoro.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class SimpleFormLogData {

    @NotBlank(message = "wpisz login")
    private String login;

    @Min(value = 000000000)
    @Max(value = 999999999)
    private int phone;

    @NotBlank(message = "wpisz hasło")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

//    public int getPhone() {
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}
}
