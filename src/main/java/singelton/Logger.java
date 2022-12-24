package singelton;

import static java.util.Objects.isNull;

public class Logger {


    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (isNull(logger)) {
            logger = new Logger();
        }
        return logger;
    }
}
