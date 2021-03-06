package com.itvdn.spring.impls.robot;

import com.itvdn.spring.interfaces.Hand;
import com.itvdn.spring.interfaces.Head;
import com.itvdn.spring.interfaces.Leg;

public class ModelR extends BaseModel {

    private int lengthLaser;
    private String laserColor;


    public ModelR(){

    }

    public ModelR(int lengthLaser, String laserColor){
        this.lengthLaser = lengthLaser;
        this.laserColor = laserColor;
    }

    public ModelR(Hand hand, Leg leg, Head head, int lengthLaser, String laserColor){
        super(hand, leg, head);
        this.laserColor = laserColor;
        this.lengthLaser = lengthLaser;
    }

    public int getLengthLaser(){
        return lengthLaser;
    }

    public void setLengthLaser(int lengthLaser){
        this.lengthLaser = lengthLaser;
    }

    public String getLaserColor(){
        return laserColor;
    }

    public void setLaserColor(String laserColor){
        this.laserColor = laserColor;
    }

    public void action(){
        getHand().catchSomething();
        getHead().calc();
        getLeg().go();
    }

    public void dance(){
        System.out.println("ModelR is dancing!");
    }
}
