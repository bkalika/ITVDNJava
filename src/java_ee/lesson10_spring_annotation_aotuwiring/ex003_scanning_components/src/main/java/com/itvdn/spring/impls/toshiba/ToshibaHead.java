package com.itvdn.spring.impls.toshiba;

import com.itvdn.spring.interfaces.Head;
import org.springframework.stereotype.Component;

@Component
public class ToshibaHead implements Head {

    public void calc(){
        System.out.println("Thinking about Toshiba...");
    }

}
