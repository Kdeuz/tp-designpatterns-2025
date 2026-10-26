package singleton;

public class LoggerEager {
    private int nbLoggerMessages;
    private static LoggerEager instance = new LoggerEager();
    private LoggerEager() {
        this.nbLoggerMessages = 0;
    }
    public void log(String msg) {
        this.nbLoggerMessages++;
        System.out.println("LOG" + this.nbLoggerMessages + ": " + msg);
    }
    public static LoggerEager getInstance() {
        return instance;
    }
}
