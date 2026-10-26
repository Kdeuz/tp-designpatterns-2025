import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecuritySystem {
    private List<Sensor> sensors;
    private Alarm alarm;
    private List<Camera> cameras;
    private List<Light> lights;

    public SecuritySystem() {
        sensors = Stream.generate(Sensor::new)
                .limit(5)
                .collect(Collectors.toCollection(ArrayList::new));

        alarm = new Alarm();
        cameras = Stream.generate(Camera::new)
                .limit(2)
                .collect(Collectors.toCollection(ArrayList::new));
        lights = Stream.generate(Light::new)
                .limit(3)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void activate() {
        for(Sensor sensor : sensors) {
            sensor.activate();
        }
        alarm .activate();
        for(Camera camera : cameras) {
            camera.turnOn();
        }
        for(Light light : lights) {
            light.turnOn();
        }
    }

    public void deactivate() {
        for(Sensor sensor : sensors) {
            sensor.deactivate();
        }
        alarm .deactivate();
        for(Camera camera : cameras) {
            camera.turnOff();
        }
        for(Light light : lights) {
            light.turnOff();
        }
    }
}
