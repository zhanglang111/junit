import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TestCase1 {

//    测试方法有如下特征：
//
//     1.不能有返回值
//
//　　　2.不能有参数

    private static final org.apache.log4j.Logger log = Logger.getLogger(LogTest.class);

    @Test
    public void testSum1() {
        int result = SumUtil.sum1(1, 2);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void testSum2() {
        int result = SumUtil.sum2(1, 2,3);
        Assert.assertEquals(result, 6);
    }

    @Test
    public void testchengji(){
        int result = SumUtil.chengji(2,3);
        Assert.assertEquals(result,6);
        log.info("zhanglang");
        log.trace("zjanglang");//小于info的就不会输出
    }
}
