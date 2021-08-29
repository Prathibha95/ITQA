package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTest3 {
    @Test
    public void test1() {
        System.out.println("Test 1");
    }
    @Test
    public void test2() {
        System.out.println("Test 2");
    }
    @BeforeMethod
//    Pre condition and execute before any method
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @AfterMethod
//    Post conditions
    public void afterMethod() {
        System.out.println("After Method");
    }
}
// Run program from class level
//        Before Method
//        Test 1
//        After Method
//        Before Method
//        Test 2
//        After Method
