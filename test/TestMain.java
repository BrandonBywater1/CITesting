import org.junit.Assert;
import org.junit.Test;

public class TestMain {
    @Test
    public static void test1() {
        System.out.println("Test1");
    }

    public static void test2() {
        int expected = 5;
        Assert.assertEquals(expected, AddTwo.addTwo(2, 3));
    }

}
