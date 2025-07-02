import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("This message will appear in both console and file.");
        logger.warn("Warning message logged to multiple appenders.");
    }
}
