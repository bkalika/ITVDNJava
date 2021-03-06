package com.itvdn.spring.impls.sony;

import com.itvdn.spring.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class SonyHead implements Head {

    private String color;

    public void calc(){
        System.out.println("Thinking about Sony...");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
