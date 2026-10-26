public class LoggerEager {
    private int nbLoggedMessages ;
    private static final LoggerEager uniqueInstance = new LoggerEager();
    private LoggerEager () {
        this.nbLoggedMessages = 0 ;
    }

    public static LoggerEager instance() {
        return uniqueInstance;
    }

    public void log ( String msg ) {
        this.nbLoggedMessages++;
        System.out.println ( "LOG" + this.nbLoggedMessages + " : " + msg ) ;
    }
}
