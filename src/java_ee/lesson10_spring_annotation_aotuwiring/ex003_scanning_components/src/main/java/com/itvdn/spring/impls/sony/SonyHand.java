package com.itvdn.spring.impls.sony;

import com.itvdn.spring.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class SonyHand implements Hand {

    public void catchSomething(){
        System.out.println("Catched from Sony!!");
    }

}
