package testng.annotation;

import org.testng.annotations.Test;

public class PriorityTest2 {
    @Test(priority = 0)
    public void testLogin() {
        System.out.println("Login");
    }

    @Test(priority = 1)
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(priority = 2)
    public void testEdit() {
        System.out.println("Edit");
    }

    @Test(priority = 3)
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void testLogout() {
        System.out.println("Logout");
    }
    // Login
    // Logout - have default priority because we do not over write it.
                // therefore login priority 0 and this are in same level,
                // order them ascending order
    // Create
    // Edit
    // Delete
}
