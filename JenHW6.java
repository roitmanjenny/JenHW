import org.testng.Assert;
import org.testng.annotations.*;
public class JenHW6 {

    //1
    // before the test
    @BeforeClass
    public void runOnceBeforeClass() {
        System.out.println("Before");
    }

    // after the test
    @AfterClass
    public void runOnceAfterClass() {
        System.out.println("After");
    }

    @Test
    public void test_method1() {
        System.out.println("@Test");
    }

    //2
    int x =1;
    int y=2;

    @Test
    public void test_method2() {
        Assert.assertNotEquals(x, y);
    }

    //3
    @Test
    public void test_method3() {
        System.out.println("A");
    }

    @Test
    public void test_method4() {
        System.out.println("B");
    }

    @Test
    public void test_method5() {
        System.out.println("C");
    }

}
