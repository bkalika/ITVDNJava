package patterns.abstractfactory.transport.impl.aircraft;

import patterns.abstractfactory.transport.interfaces.Aircraft;

public class Boeing747 implements Aircraft {

    @Override
    public void flight() {
        throw new UnsupportedOperationException("not supported yet.");
    }
}
