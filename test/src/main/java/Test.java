import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class);
//    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);//获取根Logger

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            System.out.println(i);
            logger.trace(i + "hello");
            logger.debug(i + "hello");
            logger.info(i + "hello");
            logger.warn(i + "hello");
            logger.error(i + "hello");
            logger.fatal(i + "hello");
//            logger.trace("hello");
//            logger.debug("hello");
//            logger.info("hello");
//            logger.warn("hello");
//            logger.error("hello");
//            logger.fatal("hello");
        }

    }
}
