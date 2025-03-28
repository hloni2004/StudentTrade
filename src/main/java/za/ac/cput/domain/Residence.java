package za.ac.cput.domain;


// Zamandlovu C Ndlovu (211204803)
//Resindance Domain Class
public class Residence {
    private String locationAddress;
    private String roomNumber;

    private Residence(){

    }
    //Constructor
    private Residence(ResidenceBuilder builder) {
        this.locationAddress = builder.locationAddress;
        this.roomNumber = builder.roomNumber;
    }
// Getters
    public String getLocationAddress() {
        return locationAddress;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
// toSring Method
    @Override
    public String toString() {
        return "Residence" + '\n' +
                "locationAddress= " + locationAddress + '\n' +
                "roomNumber= " + roomNumber + '\n' ;
    }
// Residence Builder Class
    public static class  ResidenceBuilder{
        private String locationAddress;
        private String roomNumber;

        //Builder Setters
        public ResidenceBuilder setLocationAddress(String locationAddress) {

            this.locationAddress = locationAddress;
            return this;
        }
        public ResidenceBuilder setRoomNumber(String RoomNumber) {

            this.roomNumber = roomNumber;
            return this;
        }
        //Builder Construtor
        public ResidenceBuilder copy(Residence r){
            this.locationAddress = r.locationAddress;
            this.roomNumber = r.roomNumber;
            return this;
        }
    //method that collect all variables under Residence class
        public Residence getResidence(){
            return new Residence(this);
        }

    }
}
