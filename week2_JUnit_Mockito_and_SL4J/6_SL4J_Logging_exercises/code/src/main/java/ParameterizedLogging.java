import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "JohnDoe";
        int failedAttempts = 5;

        logger.info("User {} has failed to login {} times", username, failedAttempts);
        logger.debug("Login attempt details: user={}, attempts={}", username, failedAttempts);
    }
}
