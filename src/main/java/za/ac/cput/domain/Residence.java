//package za.ac.cput.domain;
//
//public class Residence {
//
//
//// Zamandlovu C Ndlovu (211204803)
////Resindance Domain Class
//
//    // Residence Builder Class
//    public static class ResidenceBuilder {
//        private String locationAddress;
//        private String roomNumber;
//
//        //Builder Setters
//        // public ResidenceBuilder setLocationAddress(String locationAddress) {
//
//        //  this.locationAddress = locationAddress;
//        //  return this;
//        //   }
//        //  public ResidenceBuilder setRoomNumber(String RoomNumber) {
//
//        // this.roomNumber = roomNumber;
//        // return this;
//        // }
//        //Builder Construtor
////        public ResidenceBuilder copy(Residence r){
////            this.locationAddress = r.locationAddress;
////            this.roomNumber = r.roomNumber;
////            return this;
////        }
//        //method that collect all variables under Residence class
//      //  public Residence getResidence() {
//         //   return new Residence(this);
//       // }
//
//        private Address address;   // Composition: Residence "has-a" Address
//        private int floorNumber;
//        // private int roomNumber;
//
//        // Private constructor to enforce the use of the Builder
//    //    private Residence(Builder builder) {
//          //  this.address = builder.address;
//          //  this.floorNumber = builder.floorNumber;
//            //this.roomNumber = builder.roomNumber;
//        }
//
//        // Getters
//        public Address getAddress() {
//            return address;
//        }
//
//        public int getFloorNumber() {
//            return floorNumber;
//        }
//
//        //public int getRoomNumber() {
//        //  return roomNumber;
//        // }
//
//        // Builder class
//        public static class Builder {
//            private Address address;
//            private int floorNumber;
//            private int roomNumber;
//
//            public Builder setAddress(Address address) {
//                this.address = address;
//                return this;
//            }
//
//            public Builder setFloorNumber(int floorNumber) {
//                this.floorNumber = floorNumber;
//                return this;
//            }
//
//            public Builder setRoomNumber(int roomNumber) {
//                this.roomNumber = roomNumber;
//                return this;
//            }
//
//            private Builder copy(Builder builder) {
//                this.address = builder.address;
//                this.floorNumber = builder.floorNumber;
//                this.roomNumber = builder.roomNumber;
//                return this;
//            }
//
//            public Residence build() {
//                return new Residence(this);
//            }
//        }
//
//        @Override
//        public String toString() {
//            return "Residence{" +
//                    "address=" + address +
//                    ", floorNumber=" + floorNumber +
//                    ", roomNumber=" + roomNumber +
//                    '}';
//
//        }
//    }
//}
