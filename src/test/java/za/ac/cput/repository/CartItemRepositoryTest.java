package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.CartItem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class CartItemRepositoryTest {

    private static ICartItemRepository repository = CartItemRepository.getRepository();
    private static List<CartItem> items = new ArrayList<>();
    private static CartItem cartItem = new CartItem.Builder().setId(1).setItems(items).build();

    @Test
    void a_create() {
        // Create CartItem and check if it's not null
        CartItem createdCartItem = repository.create(cartItem);
        assertNotNull(createdCartItem);
        System.out.println(createdCartItem.toString());
    }

    @Test
    void b_read() {
        repository.create(cartItem);
        CartItem readCartItem = repository.read(cartItem.getId());
        assertNotNull(readCartItem);
        System.out.println(readCartItem.toString());
    }

    @Test
    void c_update() {
        CartItem updatedCartItem = new CartItem.Builder().setId(1).setItems(items).build();
        CartItem updated = repository.update(updatedCartItem);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        repository.create(cartItem);
        boolean isDeleted = repository.delete(cartItem.getId());
        assertTrue(isDeleted);
        System.out.println("Deleted cart item with ID " + cartItem.getId());
    }

    @Test
    void e_getAll() {
        List<CartItem> allCartItems = repository.getAll();
        assertNotNull(allCartItems);
        System.out.println(allCartItems);
    }
}
