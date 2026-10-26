public class Logger {
    private int nbLoggedMessages ;
    private static Logger uniqueInstance = null;
    private Logger () {
        this.nbLoggedMessages = 0 ;
    }

    public static Logger instance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Logger();
        }
        return uniqueInstance;
    }

    public void log ( String msg ) {
        this.nbLoggedMessages++;
        System.out.println ( "LOG" + this.nbLoggedMessages + " : " + msg ) ;
    }
}