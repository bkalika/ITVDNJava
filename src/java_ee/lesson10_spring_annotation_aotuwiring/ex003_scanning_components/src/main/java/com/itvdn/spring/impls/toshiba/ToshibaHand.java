package com.itvdn.spring.impls.toshiba;

import com.itvdn.spring.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {

    public void catchSomething(){
        System.out.println("Catched from Toshiba!");
    }

}
