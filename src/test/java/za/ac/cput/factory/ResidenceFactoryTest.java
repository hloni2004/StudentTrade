package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Residence;
import static org.junit.jupiter.api.Assertions.*;

class ResidenceFactoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCreateResidenceValidInput() {
        Residence residence = ResidenceFactory.createResidence(
                "123 Main St",
                "Cape Town",
                "Western Cape",
                "8000",
                "South Africa",
                3,
                101
        );
        assertNotNull(residence, "Residence should be created with valid input.");
        assertEquals("123 Main St", residence.getAddress().getStreetName());
        assertEquals("Cape Town", residence.getAddress().getCity());
        assertEquals("Western Cape", residence.getAddress().getProvince());
        assertEquals("8000", residence.getAddress().getPostalCode());
        assertEquals("South Africa", residence.getAddress().getCountry());
        assertEquals(3, residence.getFloorNumber());
        assertEquals(101, residence.getRoomNumber());
    }

    @Test
    void testCreateResidenceInvalidInput() {
        // Passing an empty street name should cause the creation to fail.
        Residence residence = ResidenceFactory.createResidence(
                "",
                "Cape Town",
                "Western Cape",
                "8000",
                "South Africa",
                3,
                101
        );
        assertNull(residence, "Residence should be null when input is invalid.");
    }
}
