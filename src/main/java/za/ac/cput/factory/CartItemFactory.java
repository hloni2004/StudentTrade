package za.ac.cput.factory;

import za.ac.cput.domain.CartItem;
import za.ac.cput.domain.Listing;
import java.util.List;

public class CartItemFactory {

    public static CartItem createCartItem(int id, Listing list, List<CartItem> items) {

        if (id < 0 || list == null || items == null) {
            return null;
        }

        return new CartItem.Builder()
                .setId(id)
                .setList(list)
                .setItems(items)
                .build();
    }
}