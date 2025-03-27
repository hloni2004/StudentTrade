package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.util.ProductHelper;

public class ProductFactory {

    public static Product createProduct(int productID, String productName,
                                        double price, String seller, String status) {

        if (productID < 0 || ProductHelper.isNullOrEmpty(productName) ||
                price < 0 || ProductHelper.isNullOrEmpty(seller) || ProductHelper.isNullOrEmpty(status))
            return null;

        return new Product.Builder().setProductID(productID)
                .setProductName(productName)
                .setPrice(price)
                .setSeller(seller)
                .setStatus(status)
                .build();
    }

    public static Product createProduct(int productID, String productName, String productDescription,
                                        double price, String condition, String seller, String status) {

        if (productID < 0 || ProductHelper.isNullOrEmpty(productName) || price < 0)
            return null;


        if (ProductHelper.isNullOrEmpty(productDescription))
            productDescription = "";

        if (ProductHelper.isNullOrEmpty(condition))
            condition = "";

        return new Product.Builder().setProductID(productID)
                .setProductName(productName)
                .setProductDescription(productDescription)
                .setPrice(price)
                .setCondition(condition)
                .setSeller(seller)
                .setStatus(status)
                .build();
    }
}


