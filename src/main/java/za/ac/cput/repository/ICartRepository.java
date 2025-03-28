package za.ac.cput.repository;

import za.ac.cput.domain.Cart;
import java.util.List;

public interface ICartRepository extends IRepository<Cart, Integer> {
    List<Cart> getAll();
}

