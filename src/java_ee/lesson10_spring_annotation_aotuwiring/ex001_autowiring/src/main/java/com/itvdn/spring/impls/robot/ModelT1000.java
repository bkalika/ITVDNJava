package com.itvdn.spring.impls.robot;

import com.itvdn.spring.abstracts.robot.BaseModel;
import com.itvdn.spring.interfaces.Hand;
import com.itvdn.spring.interfaces.Head;
import com.itvdn.spring.interfaces.Leg;
import com.itvdn.spring.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super(hand, leg, head);
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled){
        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled){
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    //@Override
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    //@Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean isSoundEnabled(){
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled){
        this.soundEnabled = soundEnabled;
    }

    public void destroy() throws Exception{
        System.out.println(this + " - method destroy()");
    }

    public void afterPropertiesSet() throws Exception{
        System.out.println(this + " - method init()");
    }
}
