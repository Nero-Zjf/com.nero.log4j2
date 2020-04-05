import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicSampleTest {
    private static final Logger logger = LogManager.getLogger(BasicSampleTest.class);
//    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);//获取根Logger

    public static void main(String[] args) {
        logger.info("hello");
        logger.debug("hello");
        logger.error("hello");
        logger.info("world");
    }
}
