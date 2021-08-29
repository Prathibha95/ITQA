package testng.annotation;

import org.testng.annotations.Test;

public class TestNgTest5 {
    @Test
    public void testLogin() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }

    @Test
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout");
    }

//    Create
//    Delete
//    Edit
//    Login
//    Logout
    // Ascending order of the method names
    // with in a single class framework will execute in a different way and it is not our expected output
    // pass rate is (2/5)*100 = 40%
    // if we run these things are individually they are working in an expected manner
}
