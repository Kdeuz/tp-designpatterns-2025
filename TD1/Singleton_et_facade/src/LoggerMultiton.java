import java.util.HashMap;
import java.util.Map;

public class LoggerMultiton {
    private static Map<String, LoggerMultiton> instances = new HashMap<String, LoggerMultiton>();

    private String name = "";
    private int nbLoggedMessages ;
    private LoggerMultiton() {
        this.nbLoggedMessages = 0 ;
    }
    private LoggerMultiton(String name) {
        this();
        this.name = name;
    }

    public static LoggerMultiton getInstance(String name) throws LoggerMultitonException {
        LoggerMultiton instance = instances.get(name);
        if(instance == null) {
            newInstance(name);
            return instances.get(name);
        } else {
            return instance;
        }
    }

    public static void newInstance(String name) {
        instances.put(name, new LoggerMultiton(name));
    }

    public void log(String msg) {
        this.nbLoggedMessages++;
        System.out.println ( "LOG" + this.name + this.nbLoggedMessages + " : " + msg ) ;
    }
}