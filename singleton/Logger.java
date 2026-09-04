import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger instance;

    private final FileWriter file;

    private Logger() {
        try {
            file = new FileWriter("app.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try {
            file.write(message + "\n");
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}