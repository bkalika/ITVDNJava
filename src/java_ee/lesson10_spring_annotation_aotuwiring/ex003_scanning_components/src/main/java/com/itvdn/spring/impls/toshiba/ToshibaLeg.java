package com.itvdn.spring.impls.toshiba;

import com.itvdn.spring.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component
public class ToshibaLeg implements Leg {

    public void go(){
        System.out.println("Go to Toshiba!");
    }

}
