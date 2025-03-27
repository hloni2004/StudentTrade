package za.ac.cput.util;

import za.ac.cput.domain.Cart;
import za.ac.cput.domain.CartItem;

import java.util.List;

public class CartHelper {

    public static boolean isValidCart(Cart cart) {
        return cart != null && cart.getId() > 0 && cart.getOwner() != null && cart.getItems() != null;
    }

    public static boolean isCartEmpty(Cart cart) {
        return cart != null && (cart.getItems() == null || cart.getItems().isEmpty());
    }
}
