package com.itvdn.spring.impls.robot;

import com.itvdn.spring.abstracts.robot.BaseModel;
import com.itvdn.spring.enums.ColorStyle;
import com.itvdn.spring.impls.sony.SonyHead;
import com.itvdn.spring.interfaces.Hand;
import com.itvdn.spring.interfaces.Head;
import com.itvdn.spring.interfaces.Leg;
import com.itvdn.spring.interfaces.Robot;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

    private ColorStyle color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model1(){
        return new ModelT1000();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public ModelT1000 model2(){
        return new ModelT1000(ColorStyle.BLACK, 2009, true);
    }

    public ModelT1000(Hand hand, Leg leg, Head head, ColorStyle color, int year, boolean soundEnabled){
//        super(hand, leg, head);
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(ColorStyle color, int year, boolean soundEnabled){
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    //@Override
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();

        if (getHead().getClass() == SonyHead.class){
            SonyHead sonyHead = (SonyHead) getHead();
            System.out.println("Head color: " + sonyHead.getColor());
        }
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    //@Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

    public ColorStyle getColor(){
        return color;
    }

    public void setColor(ColorStyle color){
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
