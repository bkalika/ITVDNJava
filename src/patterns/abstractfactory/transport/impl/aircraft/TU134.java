package patterns.abstractfactory.transport.impl.aircraft;

import patterns.abstractfactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }
}
