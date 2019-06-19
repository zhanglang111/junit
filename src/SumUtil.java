import org.junit.After;
import org.junit.Before;

public class SumUtil {

    //这里写方法
    //测试写另外一个class
    //里面用到方法

    @Before
    public void before() {
        System.out.println("测试前的准备工作，比如链接数据库等等");
    }
    @After
    public void after() {
        System.out.println("测试结束后的工作，比如关闭链接等等");
    }

    public static int sum1(int i, int j) {
        return i+j;
    }

    public static int sum2(int i, int j,int k) {
        return i+j+k;
    }

    public static int chengji(int i,int j){
        return i*j;
    }

}