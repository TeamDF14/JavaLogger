/**
 * It's just a simple example how you can use the Logging class.
 *
 * @author Stefan Kuppelwieser <edelblistar@online.de>
 * @version 1.0
 */
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        // startLogging
        Logging logging = new Logging();
        logging.start();

        // messages
        Logging.logger.log(Level.WARNING, "No group entered");
        Logging.logger.log(Level.INFO, "Team: Bayern Muenchen entered");
        Logging.logger.log(Level.SEVERE, "This is as severe message");
        Logging.logger.log(Level.FINEST, "this ist a finest message");

        // stopLogging
        logging.stop();
    }
}
