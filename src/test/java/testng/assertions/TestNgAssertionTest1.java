package testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAssertionTest1 {
    @Test
    public void testAssertEquals() {
        String actualValue = "University of Moratuwa";
        Assert.assertEquals(actualValue, "University of Moratuwa","Passed: ");
    }
    @Test
    public void testAssertNotEquals() {
        String actualValue = "University of Moratuwa";
        Assert.assertNotEquals(actualValue, "University","Passed: ");
    }
    @Test
    public void testAssertTrue() {
        boolean trueValue = true;
        Assert.assertTrue(trueValue, "True");
    }
    @Test
    public void testAssertFalse() {
        boolean trueValue = false;
        Assert.assertFalse(trueValue, "False");
    }
}
