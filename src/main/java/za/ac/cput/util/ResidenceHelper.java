package za.ac.cput.util;

import za.ac.cput.domain.Residence;
import za.ac.cput.factory.ResidenceFactory;

public class ResidenceHelper {

    public static Residence createResidence(String streetName,
                                            String city,
                                            String province,
                                            String postalCode,
                                            String country,
                                            int floorNumber,
                                            int roomNumber) {
        // Create Residence using the factory
        Residence residence = ResidenceFactory.buildResidence(
                streetName,
                city,
                province,
                postalCode,
                country,
                floorNumber,
                roomNumber
        );

        // (Optional) Validate the Residence
        if (!isValidResidence(residence)) {
            // In a real application, you might throw an exception or log an error
            System.out.println("Warning: The created Residence data is invalid.");
            // return null or handle invalid data as you see fit
        }

        return residence;
    }

    /**
     * Validates a Residence object by checking its Address and numeric fields.
     * Returns true if valid, false otherwise.
     */
    public static boolean isValidResidence(Residence residence) {
        if (residence == null || residence.getAddress() == null) {
            return false;
        }
        if (isNullOrEmpty(residence.getAddress().getStreetName())) {
            return false;
        }
        if (isNullOrEmpty(residence.getAddress().getCity())) {
            return false;
        }
        if (isNullOrEmpty(residence.getAddress().getProvince())) {
            return false;
        }
        if (isNullOrEmpty(residence.getAddress().getPostalCode())) {
            return false;
        }
        if (isNullOrEmpty(residence.getAddress().getCountry())) {
            return false;
        }

        // Floor and room numbers should be non-negative (example rule)
        if (residence.getFloorNumber() < 0 || residence.getRoomNumber() < 0) {
            return false;
        }

        return true;
    }

    private static boolean isNullOrEmpty(String streetName) {
        return false;
    }
}
