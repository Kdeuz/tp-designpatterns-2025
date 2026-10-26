package facade.td;

import java.util.ArrayList;
import java.util.List;
import security.Sensor;
import security.Alarm;
import security.Camera;
import security.Light;

public class SecuritySystem {
    private List<Sensor> sensors;
    private Alarm alarm;
    private List<Camera> cameras;
    private List<Light> lights;

    public SecuritySystem(List<Sensor> sensors, Alarm alarm, List<Camera> cameras, List<Light> lights) {
        this.alarm = alarm;
        this.cameras = cameras;
        this.lights = lights;
        this.sensors = sensors;
    }

    public void activate() {
        for(Sensor s : sensors) {
            s.activate();
        }

        for(Camera c : cameras) {
            c.turnOn();
            c.rotate();
        }

        for(Light l : lights) {
            l.turnOff();
        }

        alarm.stopRing();
    }

    public void deactivate() {
        for(Sensor s : sensors) {
            s.deactivate();
        }
        for(Camera c : cameras) {
            c.turnOff();
        }

        alarm.deactivate();
    }

    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        List<Camera> cameras = new ArrayList<>();
        List<Light> lights = new ArrayList<>();
        Alarm alarm = new Alarm();

        for(int i = 0; i<5; i++) {
            sensors.add(new Sensor());
        }

        for(int i = 0; i<2; i++) {
            cameras.add(new Camera());
        }

        for(int i = 0; i<3; i++) {
            lights.add(new Light());
        }

        SecuritySystem securitySystem = new SecuritySystem(sensors, alarm, cameras, lights);

    }
}
