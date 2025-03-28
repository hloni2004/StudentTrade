package za.ac.cput.util;

import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Listing;

public class CartItemHelper {

    public static boolean isValidCartItem(CartItem cartItem) {
        return cartItem != null && cartItem.getId() >= 0 && cartItem.getList() != null && cartItem.getItems() != null;
    }
}
