package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Product;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ProductFactoryTest {

    private static Product p1 = ProductFactory.createProduct(101, "Laptop", 1200.00, "CPUT", "Available");
    private static Product p2 = ProductFactory.createProduct(102, "Smartphone", "Latest model smartphone", 799.99, "New", "CPUT", "Out of stock");
    private static Product p3 = ProductFactory.createProduct(103, "Headphones", "Wireless noise-cancelling headphones", 199.99, "Used", "CPUT", "Available");

    @Test
    @Order(1)
    public void testCreateProduct() {
        assertNotNull(p1);
        System.out.println(p1.toString());
    }

    @Test
    @Order(2)
    public void testCreateProductWithAllAttributes() {
        assertNotNull(p2);
        System.out.println(p2.toString());
    }

    @Test
    @Order(3)
    public void testCreateProductThatFails() {
        fail();
        assertNotNull(p3);
        System.out.println(p3.toString());
    }

    @Test
    @Order(4)
    @Disabled()
    public void testNotImplemented() {
    }
}

