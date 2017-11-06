/**
 * The class implements the logging for the whole project
 * It contains info, severe, warning, finest.
 *
 * @author Stefan Kuppelwieser <edelblistar@online.de>
 * @version 1.0.3
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Logging {

    /**
     * With this static logger you can log information of the logging levels Info, severe, warning,
     * fines.
     */
    public static Logger logger = Logger.getLogger(Logging.class.getName());

    /**
     * Var filehandler. It will once be initiated in the start method to save the logging file
     */
    public FileHandler filehandler;

    /**
     * Create the logging File at runtime directory, it will only start once.
     */
    public void start() {

        // This block configures the logger with handler and formatter
        // It logs files to a maximum of 5 MB
        // The maximum amount of files is 3
        try {
            this.filehandler = new FileHandler("LogFileName.log", 5120 * 1024, 3, true);
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.addHandler(filehandler);
        SimpleFormatter formatter = new SimpleFormatter();
        this.filehandler.setFormatter(formatter);

        // Set the LogLevel to Info, severe, warning, finest will be written
        logger.setLevel(Level.FINEST);

        // Adds a new shutDownHook when the program is ended (unexpected)
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    if (filehandler != null) {
                        filehandler.close();
                        logger.removeHandler(filehandler);
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    /**
     * Close the logging file
     */
    public void stop() {
        this.filehandler.close();
    }


}
