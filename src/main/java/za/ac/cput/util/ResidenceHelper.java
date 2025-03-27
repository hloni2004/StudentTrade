package za.ac.cput.util;

import za.ac.cput.domain.Residence;
import za.ac.cput.factory.ResidenceFactory;

public class ResidenceHelper {

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

    public static boolean isNullOrEmpty(String streetName) {
        return false;
    }
}
