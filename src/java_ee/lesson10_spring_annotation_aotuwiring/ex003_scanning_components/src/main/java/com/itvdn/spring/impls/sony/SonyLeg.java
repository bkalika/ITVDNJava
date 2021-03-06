package com.itvdn.spring.impls.sony;

import com.itvdn.spring.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class SonyLeg implements Leg {

    public void go(){
        System.out.println("Go to Sony!");
    }

}
