package za.ac.cput.domain;

public class Product {
    protected int productID;
    protected String productName;
    protected String productDescription;
    protected double price;
    protected String condition;
    protected String seller;
    protected String status;

    public Product() {
    }

    private Product(Builder builder){
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.price = builder.price;
        this.condition = builder.condition;
        this.seller = builder.seller;
        this.status = builder.status;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }

    public String getSeller() {
        return seller;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                ", seller='" + seller + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder {
        private int productID;
        private String productName;
        private String productDescription;
        private double price;
        private String condition;
        private String seller;
        private String status;

        public Builder setProductID(int productID) {
            this.productID = productID;
            return this;
        }

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setProductDescription(String productDescription) {
            this.productDescription = productDescription;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = condition;
            return this;
        }

        public Builder setSeller(String seller) {
            this.seller = seller;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(Product product) {
            this.productID = product.productID;
            this.productName = product.productName;
            this.productDescription = product.productDescription;
            this.price = product.price;
            this.condition = product.condition;
            this.seller = product.seller;
            this.status = product.status;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

