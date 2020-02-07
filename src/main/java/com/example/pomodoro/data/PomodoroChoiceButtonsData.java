package com.example.pomodoro.data;

//import com.example.pomodoro.model.WorkTimer;

import javax.xml.crypto.Data;
import java.util.Timer;

public class PomodoroChoiceButtonsData {

    private String work;
    private String breake;

    public String getWork(){
        return work;
    }

    public void setWork(String work){
        this.work = work;
    }

    public String getBreake(){
        return breake;
    }

    public void setBreake(String breake){
        this.breake = breake;
    }

//    public void showWorkTimer(){
//        Timer timer = new Timer();
//        WorkTimer workTimer = new WorkTimer();
//        timer.schedule(workTimer,25);
//    }

}
