package za.ac.cput.domain;


import java.util.List;

public class CartItem {

    private int id ;
    private Listing list;
    private List<CartItem> items;

    public CartItem(){

    }
    public CartItem(Builder builder ){
        this.id = builder.id;
        this.list  = builder.list;
        this.items = builder.items;
    }

    public int getId() {
        return id;
    }

    public Listing getList() {
        return list;
    }

    public List<CartItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", list=" + list +
                ", items=" + items +
                '}';
    }

    public static class Builder{
        private int id ;
        private Listing list;
        private List<CartItem> items;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setList(Listing list) {
            this.list = list;
            return this;
        }

        public Builder setItems(List<CartItem> items) {
            this.items = items;
            return this;

        }

        public void copy(Builder builder){
            this.id = builder.id;
            this.list  = builder.list;
            this.items = builder.items;



        }

        public CartItem build(){

           return new CartItem(this);
        }


    }
}
