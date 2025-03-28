package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.CartItem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartFactoryTest {

    private static Student student1 = new Student();
    private static List<CartItem> cartItems = new ArrayList<>(); // Empty cart items list

    private static Cart c1 = CartFactory.createCart(201, student1, cartItems);
    private static Cart c2 = CartFactory.createCart(202, student1, null);
    private static Cart c3 = CartFactory.createCart(-1, null, cartItems);

    @Test
    @Order(1)
    public void testCreateCart() {
        assertNotNull(c1);
        System.out.println(c1.toString());
    }

    @Test
    @Order(2)
    public void testCreateCartWithNullItems() {
        assertNotNull(c2);
        System.out.println(c2.toString());
    }

    @Test
    @Order(3)
    public void testCreateCartThatFails() {
        fail();
        assertNotNull(c3);
        System.out.println(c3.toString());
    }

    @Test
    @Order(4)
    @Disabled()
    public void testNotImplemented() {
    }
}
