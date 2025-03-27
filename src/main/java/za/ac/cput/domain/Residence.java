package za.ac.cput.domain;



public class Residence {

    private Address address;   // Composition: Residence "has-a" Address
    private int floorNumber;
    private int roomNumber;

    // Private constructor to enforce the use of the Builder
    private Residence(Builder builder) {
        this.address = builder.address;
        this.floorNumber = builder.floorNumber;
        this.roomNumber = builder.roomNumber;
    }

    // Getters
    public Address getAddress() {
        return address;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    // Builder class
    public static class Builder {
        private Address address;
        private int floorNumber;
        private int roomNumber;

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setFloorNumber(int floorNumber) {
            this.floorNumber = floorNumber;
            return this;
        }

        public Builder setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        private Builder copy(Builder builder) {
            this.address = builder.address;
            this.floorNumber = builder.floorNumber;
            this.roomNumber = builder.roomNumber;
            return this;
        }

        public Residence build() {
            return new Residence(this);
        }
    }

    @Override
    public String toString() {
        return "Residence{" +
                "address=" + address +
                ", floorNumber=" + floorNumber +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
