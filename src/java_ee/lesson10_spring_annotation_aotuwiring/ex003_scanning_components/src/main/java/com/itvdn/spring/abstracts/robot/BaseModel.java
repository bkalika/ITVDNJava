package com.itvdn.spring.abstracts.robot;

import com.itvdn.spring.interfaces.Hand;
import com.itvdn.spring.interfaces.Head;
import com.itvdn.spring.interfaces.Leg;
import com.itvdn.spring.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseModel implements Robot {

    @Autowired
    @Qualifier("sonyHand")
    private Hand hand;

    @Autowired
    @Qualifier("toshibaLeg")
    private Leg leg;

    @Autowired
    @Qualifier("sonyHead")
    private Head head;

    public BaseModel(){
        System.out.println(this + " - BaseModel constructor()");
    }

//    public BaseModel(Hand hand, Leg leg, Head head){
//        this();
//        this.hand = hand;
//        this.leg = leg;
//        this.head = head;
//    }

    public Hand getHand(){
        return hand;
    }

    public void setHand(Hand hand){
        this.hand = hand;
    }

    public Leg getLeg(){
        return leg;
    }

    public void setLeg(Leg leg){
        this.leg = leg;
    }

    public Head getHead(){
        return head;
    }

    public void setHead(Head head){
        this.head = head;
    }
}
