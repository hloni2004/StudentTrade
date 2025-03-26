package za.ac.cput.domain;


import java.util.Date;

public class Listing {

    private int id ;
    private String title ;
    private String description ;
    private Date datedPosted;

    public Listing(){

    }
    public Listing(Builder builder){

        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.datedPosted = builder.datedPosted;
    }

    public int getId() {
        return id;
    }

    public Date getDatedPosted() {
        return datedPosted;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public class Builder{

        private int id ;
        private String title ;
        private String description ;
        private Date datedPosted;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDatedPosted(Date datedPosted) {
            this.datedPosted = datedPosted;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public void copy(Builder builder){
            this.id = builder.id;
            this.title = builder.title;
            this.description = builder.description;
            this.datedPosted = builder.datedPosted;

        }

        public Listing build(){
            return new Listing(this);
        }
    }
}
