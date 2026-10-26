import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecuritySystemFacade {
    private List<Sensor> sensors;
    private Alarm alarm;
    private List<Camera> cameras;
    private List<Light> lights;

    public SecuritySystemFacade() {
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

    public void activate() throws FacadeException {
        List<Object> objects = new ArrayList<>();
        objects.add(alarm);
        objects.add(cameras);
        objects.add(lights);
        objects.add(sensors);

        for(Object object : objects) {
            Facade.activate(object);
        }
    }

    public void deactivate() throws FacadeException {
        List<Object> objects = new ArrayList<>();
        objects.add(alarm);
        objects.add(cameras);
        objects.add(lights);
        objects.add(sensors);

        for(Object object : objects) {
            Facade.deactivate(object);
        }
    }
}
