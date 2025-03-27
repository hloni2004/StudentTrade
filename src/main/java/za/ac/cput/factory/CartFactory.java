package za.ac.cput.factory;

import za.ac.cput.domain.Cart;
import za.ac.cput.domain.Student;
import za.ac.cput.domain.CartItem;
import java.util.List;

public class CartFactory {

    public static Cart createCart(int id, Student owner, List<CartItem> items) {

        if (id < 0 || owner == null || items == null) {
            return null;
        }

        return new Cart.Builder()
                .setId(id)
                .setOwner(owner)
                .setItems(items)
                .build();
    }
}