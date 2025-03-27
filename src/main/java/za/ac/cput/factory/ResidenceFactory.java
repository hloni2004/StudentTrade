package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Residence;
import za.ac.cput.util.ResidenceHelper;

public class ResidenceFactory {

    public static Residence createResidence(String streetName,
                                            String city,
                                            String province,
                                            String postalCode,
                                            String country,
                                            int floorNumber,
                                            int roomNumber) {
        // Validate required fields and numerical values
        if (ResidenceHelper.isNullOrEmpty(streetName) ||
                ResidenceHelper.isNullOrEmpty(city) ||
                ResidenceHelper.isNullOrEmpty(province) ||
                ResidenceHelper.isNullOrEmpty(postalCode) ||
                ResidenceHelper.isNullOrEmpty(country) ||
                floorNumber < 0 || roomNumber < 0) {
            return null;
        }

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
