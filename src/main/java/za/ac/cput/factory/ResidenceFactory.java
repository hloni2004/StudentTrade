package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Residence;

public class ResidenceFactory {

        public static Residence buildResidence(String streetName,
                                               String city,
                                               String province,
                                               String postalCode,
                                               String country,
                                               int floorNumber,
                                               int roomNumber) {
            Address address = new Address.Builder()
                    .setStreetName(streetName)
                    .setCity(city)
                    .setProvince(province)
                    .setPostalCode(postalCode)
                    .setCountry(country)
                    .build();

            return new Residence.Builder()
                    .setAddress(address)
                    .setFloorNumber(floorNumber)
                    .setRoomNumber(roomNumber)
                    .build();
        }
}