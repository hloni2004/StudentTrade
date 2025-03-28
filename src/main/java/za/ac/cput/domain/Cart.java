package za.ac.cput.domain;


import java.util.List;

public class Cart {

    private int id;
    private Student owner;
    private List<CartItem> items;

    private Cart(){

    }

    private Cart(Builder builder){
        this.id = builder.id;;
        this.owner = builder.owner;
        this.items = builder.items;

    }

    public int getId() {
        return id;
    }

    public Student getOwner() {
        return owner;
    }

    public List<CartItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", owner=" + owner +
                ", items=" + items +
                '}';
    }

    public static class Builder{
        private int id;
        private Student owner;
        private List<CartItem> items;

        public Builder setOwner(Student owner) {
            this.owner = owner;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setItems(List<CartItem> items) {
            this.items = items;
            return this;
        }
        public Cart build(){
            return new Cart(this);
        }
    }

}

