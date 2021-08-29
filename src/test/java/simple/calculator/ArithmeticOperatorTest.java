package simple.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArithmeticOperatorTest {
    ArithmeticOperator calc;

    @BeforeMethod
    public void setUp() {
        calc = new ArithmeticOperator();
    }

//    @Test
//    public void testSum() {
//        Assert.assertEquals(calc.sum(  100, 200), 300,  "Failed to calculate sum");
//        Assert.assertEquals(calc.sum(-100, -200), -310);
//        Assert.assertEquals(calc.sum(-1, 1), 0);
//        Assert.assertEquals(calc.sum(0, -1), -1);
//        // if we do so test will fail use DataProvider annotation
//
//    }

    @Test(dataProvider = "getData")
    public void testSum(int input_1, int input_2, int expected, String message) {
        Assert.assertEquals(calc.sum(  input_1, input_2), expected);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][] {
                {100, 200, 300, "Failed to calculate sum"},
                {-100, -200, -310, "Failed to calculate sum"},
                {-1, 1, 0, "Failed to calculate sum"},
                {0, -1, -1, "Failed to calculate sum"}
        };
    }
}
