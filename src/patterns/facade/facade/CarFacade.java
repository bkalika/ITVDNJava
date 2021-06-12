package patterns.facade.facade;

import patterns.facade.parts.Door;
import patterns.facade.parts.Wheel;
import patterns.facade.parts.Zazhiganie;

public class CarFacade {
    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go() {
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
}
