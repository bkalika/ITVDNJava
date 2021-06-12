package patterns.abstractfactory.factory.impl;

import patterns.abstractfactory.factory.interfaces.TransportFactory;
import patterns.abstractfactory.transport.impl.aircraft.Boeing747;
import patterns.abstractfactory.transport.impl.car.Porsche;
import patterns.abstractfactory.transport.interfaces.Aircraft;
import patterns.abstractfactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
