import javax.swing.*;

public class Facade {
    public static void activate(Object o) throws FacadeException {
        switch (o) {
            case Camera c -> c.turnOn();
            case Light l -> l.turnOff();
            case Alarm a -> a.activate();
            case Sensor s -> s.activate();
            case null, default -> throw new FacadeException();
        }
    }

    public static void deactivate(Object o) throws FacadeException {
        switch (o) {
            case Camera c -> c.turnOff();
            case Light l -> l.turnOff();
            case Alarm a -> a.deactivate();
            case Sensor s -> s.deactivate();
            case null, default -> throw new FacadeException();
        }
    }

}
