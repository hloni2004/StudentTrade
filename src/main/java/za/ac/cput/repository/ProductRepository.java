package za.ac.cput.repository;

import za.ac.cput.domain.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {

    private static IProductRepository repository = null;

    private final List<Product> productList;

    private ProductRepository() {
        productList = new ArrayList<Product>();
    }

    public static IProductRepository getRepository() {
        if (repository == null) {
            repository = new ProductRepository();
        }
        return repository;
    }

    @Override
    public Product create(Product product) {
        boolean success = productList.add(product);
        if (success) {
            return product;
        }
        return null;
    }

    @Override
    public Product read(Integer productID) {
        if (productID == null) {  // Check for null to avoid NullPointerException
            return null;
        }
        for (Product p : productList) {
            if (p.getProductID() == productID) {  // Directly compare primitive int
                return p;
            }
        }
        return null;
    }

    @Override
    public Product update(Product product) {
        Integer productID = product.getProductID();
        Product existingProduct = read(productID);
        if (existingProduct == null) {
            return null;
        }

        boolean success = delete(productID);
        if (success) {
            if (productList.add(product)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer productID) {
        Product productToDelete = read(productID);
        if (productToDelete == null) {
            return false;
        }

        return productList.remove(productToDelete);
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }
}

