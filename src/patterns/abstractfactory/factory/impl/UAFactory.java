package patterns.abstractfactory.factory.impl;

import patterns.abstractfactory.factory.interfaces.TransportFactory;
import patterns.abstractfactory.transport.impl.aircraft.TU134;
import patterns.abstractfactory.transport.impl.car.Niva;
import patterns.abstractfactory.transport.interfaces.Aircraft;
import patterns.abstractfactory.transport.interfaces.Car;

public class UAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
