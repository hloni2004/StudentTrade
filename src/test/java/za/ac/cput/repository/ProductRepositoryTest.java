package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Product;
import za.ac.cput.factory.ProductFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ProductRepositoryTest {
    private static IProductRepository repository = ProductRepository.getRepository();

    private Product product = ProductFactory.createProduct(101, "Laptop", "Latest model with high performance", 1200.00, "Good", "Nkulu", "Available");

    @Test
    void a_create() {
        Product created = repository.create(product);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Product read = repository.read(product.getProductID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Product newProduct = new Product.Builder().copy(product)
                .setCondition("Bad")
                .build();
        Product updated = repository.update(newProduct);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(product.getProductID()));
        System.out.println("Deleted product " + product.getProductID());
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}