package za.ac.cput.domain;

// Zamandlovu C Ndlovu (211204803)

// Contact Class
public class Contact {
    private int cellNumber;
    private String email;

    private Contact(){}
    // Constructor
    private Contact(ContactBuilder builder){
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }
    // Getters
    public int getCellNumber() {
        return cellNumber;
    }

    public String getEmail() {
        return email;
    }
    // toString Method
    @Override
    public String toString() {
        return "Contact" + "\n" +
                "cellNumber= " + cellNumber + "\n" +
                "email= " + email + "\n" ;
    }
    // Contact Builder Class
    public static class ContactBuilder {
        private int cellNumber;
        private String email;

        //Builder setters
        public ContactBuilder setCellNumber(int cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }
        public ContactBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        //Bulider Constructor
        public ContactBuilder copy(Contact c){
            this.cellNumber = c.getCellNumber();
            this.email = c.getEmail();
            return this;
        }

        //method that collect all variables under Contact class
        public Contact getContact() {
            return new Contact(this);
        }
    }
}
