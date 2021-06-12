package patterns.abstractfactory.start;

import patterns.abstractfactory.factory.impl.UAFactory;
import patterns.abstractfactory.factory.impl.USAFactory;
import patterns.abstractfactory.factory.interfaces.TransportFactory;
import patterns.abstractfactory.transport.interfaces.Aircraft;

public class Start {
    private static TransportFactory factory;

    public static void main(String[] args) {

        if (true) {
            factory = new UAFactory();
        } else {
            factory = new USAFactory();
        }

        factory.createAircraft();
        factory.createCar();
    }
}
