package patterns.abstractfactory.factory.interfaces;

import patterns.abstractfactory.transport.interfaces.Aircraft;
import patterns.abstractfactory.transport.interfaces.Car;

public interface TransportFactory {
    Car createCar();
    Aircraft createAircraft();
}
