package za.ac.cput.domain;

public class Address {

    private String streetName;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    // Private constructor to enforce the use of the Builder
    private Address(Builder builder) {
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
        this.country = builder.country;
    }

    // Getters (no setters to maintain immutability)
    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    // Builder class
    public static class Builder {
        private String streetName;
        private String city;
        private String province;
        private String postalCode;
        private String country;

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        private Builder copy(Builder builder) {
            this.streetName = builder.streetName;
            this.city = builder.city;
            this.province = builder.province;
            this.postalCode = builder.postalCode;
            this.country = builder.country;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
