package singleton;

import java.util.HashMap;
import java.util.Map;

public class MultitonLogger {
    private static Map<String,MultitonLogger> instances = new HashMap<>();
    private int nbLoggedMessages;
    private String key;
    private MultitonLogger(String str) {
        this.nbLoggedMessages = 0;
        this.key = str;
    }
    public void log(String msg) {
        this.nbLoggedMessages++;
        System.out.println("LOG [" + this.key + "] " + this.nbLoggedMessages + ": " + msg);
    }

    public static MultitonLogger instance(String key) {
        if (!instances.containsKey(key)) {
            instances.put(key, new MultitonLogger(key));
        }
        return instances.get(key);
    }
}
