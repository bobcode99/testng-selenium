package demo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test()
public class SampleTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][]{{1, 2, 3}, {2, 3, 5}};
    }

    @Test
    public void test1() {
        System.out.println("I am inside Test 1 | " + Thread.currentThread().getId());
//        Assert.assertEquals("First Line\nSecond Line", "Third Line\nFourth Line");
        Assert.assertEquals("33", "33");

    }

    @Test(dataProvider = "data")
    public void test2(int a, int b, int result) {
        int actualResult = a + b;
        System.out.println("I am inside Test 2 | " + Thread.currentThread().getId());

        Assert.assertEquals(actualResult , result);

    }
}