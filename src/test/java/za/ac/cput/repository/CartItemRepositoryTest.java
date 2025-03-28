package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.CartItemFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CartItemRepositoryTest {

    private static ICartItemRepository repository = CartItemRepository.getRepository();

    private static List<CartItem> items = new ArrayList<>();
    //private static Student student = new Student();
    private static CartItem cartItem = new CartItem.Builder().setId(1).setItems(items).build();

    @Test
    void a_create() {
        // Create the CartItem
        CartItem createdCartItem = repository.create(cartItem);
        assertNotNull(createdCartItem);
        System.out.println(createdCartItem.toString());
    }

    @Test
    void b_read() {
        // First, create the CartItem to make sure it's in the repository
        repository.create(cartItem);
        CartItem readCartItem = repository.read(cartItem.getId());
        assertNotNull(readCartItem);
        System.out.println(readCartItem.toString());
    }

    @Test
    void c_update() {
        // Update the CartItem
        CartItem updatedCartItem = new CartItem.Builder().setId(1).setItems(items).build();
        CartItem updated = repository.update(updatedCartItem);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        // Delete the CartItem after creating it
        repository.create(cartItem);
        boolean isDeleted = repository.delete(cartItem.getId());
        assertTrue(isDeleted);
        System.out.println("Deleted cart item with ID " + cartItem.getId());
    }

    @Test
    void e_getAll() {
        // Fetch all CartItems and check they are returned
        List<CartItem> allCartItems = repository.getAll();
        assertNotNull(allCartItems);
        System.out.println(allCartItems);
    }
}
