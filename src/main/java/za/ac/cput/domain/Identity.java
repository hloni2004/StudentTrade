package za.ac.cput.domain;

import java.time.LocalDate;
//Zamandlovu C Ndlovu (211204803)
public class Identity {
    private LocalDate dateOfBirth;
    private String idNumber;
    private String gender;
    private String nationality;
    private String race;


    private Identity() {
    }
    //Constructor
    private Identity(IdentityBuilder builder) {
        this.dateOfBirth = builder.dateOfBirth;
        this.idNumber = builder.idNumber;
        this.gender = builder.gender;
        this.nationality = builder.nationality;
        this.race = builder.race;
    }
    //Getters
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIdNumber() { return idNumber;}

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getRace() {
        return race;
    }
    // toString Method
    @Override
    public String toString() {
        return "Identity" + "\n"+
                "dateOfBirth= " + dateOfBirth + "\n" +
                "idNumber= " + idNumber + "\n" +
                " gender= " + gender + "\n" +
                " nationality= " + nationality + "\n" +
                " race= " + race + "\n" ;
    }
    //Builder Class
    public static class IdentityBuilder {
        private LocalDate dateOfBirth;
        private String idNumber;
        private String gender;
        private String nationality;
        private String race;

        //Builder setters
        public IdentityBuilder setDateOfBirth(LocalDate dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public IdentityBuilder   setIdNumber(String idNumber){
            this.idNumber = idNumber;
            return this;
        }
        public IdentityBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public IdentityBuilder setNationality(String nationality){
            this.nationality = nationality;
            return this;
        }
        public IdentityBuilder setRace(String race){
            this.race = race;
            return this;
        }
        //Builder Constrator
        public IdentityBuilder copy(Identity i) {
            this.dateOfBirth = i.dateOfBirth;
            this.idNumber = i.idNumber;
            this.gender = i.gender;
            this.nationality = i.nationality;
            this.race = i.race;
            return this;
        }
        //method that collect all variables under Identity class
        public Identity getIdentity() {
            return new Identity(this);
        }

    }
}
