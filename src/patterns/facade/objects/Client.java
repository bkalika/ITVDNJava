package patterns.facade.objects;

import patterns.facade.facade.CarFacade;
import patterns.facade.parts.Door;
import patterns.facade.parts.Wheel;
import patterns.facade.parts.Zazhiganie;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        System.out.println("facade:");

        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
