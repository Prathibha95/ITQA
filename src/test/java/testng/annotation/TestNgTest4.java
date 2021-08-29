package testng.annotation;

import org.testng.annotations.*;

public class TestNgTest4 {
//    After Class@Test
////    public void test1() {
////        System.out.println("Test 1");
////    }
////
////    @Test
////    public void test2() {
////        System.out.println("Test 2");
////    }
////
////    @BeforeMethod
//////    Pre condition and execute before any method
////    public void beforeMethod() {
////        System.out.println("Before Method");
////    }
////
////    @AfterMethod
//////    Post conditions
////    public void afterMethod() {
////        System.out.println("After Method");
////    }
////
////    @BeforeClass
////    public void beforeClass() {
////        System.out.println("Before Class");
////    }
//////    Before Class
//////    Before Method
//////    Test 1
//////    After Method
//////    Before Method
//////    Test 2
//////    After Method
////    // if we execute code in multiple times no change happens same output is given as same
////    // once the class is loaded annotation before class will be executed.. before class is similar to pre condition.
////    @AfterClass
////    public void afterClass(){
////        System.out.println("After Class");
////    }
//////    Before Class
//////    Before Method
//////    Test 1
//////    After Method
//////    Before Method
//////    Test 2
//////    After Method
//////
@BeforeMethod

public void beforeClass() {

    System.out.println("Before Method 1");

}



    @Test

    public void test1() {

        System.out.println("Test 1");

    }



    @Test

    public void test2() {

        System.out.println("Test 2");

    }



    @AfterMethod

    public void afterClass() {

        System.out.println("After Method 1");

    }
}
