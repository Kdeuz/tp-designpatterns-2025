package singleton;

public class Logger {
    private static Logger instance;
    private int nbLoggedMessages;
    private Logger() {
        this.nbLoggedMessages=0;
    }
    public void log(String msg) {
        this.nbLoggedMessages++;
        System.out.println("LOG" + this.nbLoggedMessages + ": " + msg);
    }
    public static Logger instance() { //J'ai oublié de mettre en static!!!!!!!!!!!!!
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
