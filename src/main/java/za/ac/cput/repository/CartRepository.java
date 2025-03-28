package za.ac.cput.repository;

import za.ac.cput.domain.Cart;
import java.util.ArrayList;
import java.util.List;

public class CartRepository implements ICartRepository {

    private static ICartRepository repository = null;

    private final List<Cart> cartList;

    private CartRepository() {
        cartList = new ArrayList<Cart>();
    }

    public static ICartRepository getRepository() {
        if (repository == null) {
            repository = new CartRepository();
        }
        return repository;
    }

    @Override
    public Cart create(Cart cart) {
        boolean success = cartList.add(cart);
        if (success) {
            return cart;
        }
        return null;
    }

    @Override
    public Cart read(Integer cartId) {
        if (cartId == null) {  // Check for null to avoid NullPointerException
            return null;
        }
        for (Cart c : cartList) {
            if (c.getId() == cartId) {  // Directly compare primitive int
                return c;
            }
        }
        return null;
    }

    @Override
    public Cart update(Cart cart) {
        Integer cartId = cart.getId();
        Cart existingCart = read(cartId);
        if (existingCart == null) {
            return null;
        }

        boolean success = delete(cartId);
        if (success) {
            if (cartList.add(cart)) {
                return cart;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer cartId) {
        Cart cartToDelete = read(cartId);
        if (cartToDelete == null) {
            return false;
        }

        return cartList.remove(cartToDelete);
    }

    @Override
    public List<Cart> getAll() {
        return cartList;
    }
}

