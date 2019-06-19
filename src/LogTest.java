import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by Administrator on 2018\1\30 0030.
 */
public class LogTest {

    private static final Logger log = Logger.getLogger(LogTest.class);
    private static final Logger log2 = Logger.getLogger(LogTest.class);

    @Test
    public void testLog() {
        log.trace("zjanglang");//小于info的就不会输出
    }

    @Test
    public void testLog2() {
        log2.info("test liveness");
    }
}