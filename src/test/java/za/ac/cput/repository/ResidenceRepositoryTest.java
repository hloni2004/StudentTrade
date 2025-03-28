package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Residence;
import za.ac.cput.factory.ResidenceFactory;
import za.ac.cput.repository.IResidenceRepository;
import za.ac.cput.repository.ResidenceRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ResidenceRepositoryTest {

    private static IResidenceRepository repository = ResidenceRepository.getRepository();

    private static Residence residence = ResidenceFactory.createResidence(
            "456 Second St",
            "Johannesburg",
            "Gauteng",
            "2000",       // Using postal code as the unique identifier
            "South Africa",
            2,
            202
    );

    @Test
    @Order(1)
    void testCreateResidence() {
        Residence created = repository.create(residence);
        assertNotNull(created, "Created Residence should not be null.");
        assertEquals("2000", created.getAddress().getPostalCode());
        System.out.println("Created Residence: " + created);
    }

    @Test
    @Order(2)
    void testReadResidence() {
        Residence read = repository.read("2000");
        assertNotNull(read, "Residence read from repository should not be null.");
        assertEquals("Johannesburg", read.getAddress().getCity());
        System.out.println("Read Residence: " + read);
    }

    @Test
    @Order(3)
    void testUpdateResidence() {
        Residence updatedResidence = new Residence.Builder()
                .setAddress(residence.getAddress())
                .setFloorNumber(residence.getFloorNumber())
                .setRoomNumber(303) // Updated room number
                .build();
        Residence updated = repository.update(updatedResidence);
        assertNotNull(updated, "Updated Residence should not be null.");
        assertEquals(303, updated.getRoomNumber());
        System.out.println("Updated Residence: " + updated);
    }

    @Test
    @Order(4)
    void testDeleteResidence() {
        boolean deleted = repository.delete("2000");
        assertTrue(deleted, "Residence should be successfully deleted.");
        Residence deletedResidence = repository.read("2000");
        assertNull(deletedResidence, "Deleted Residence should not be found in repository.");
        System.out.println("Deleted Residence with postal code 2000");
    }

    @Test
    @Order(5)
    void testGetAllResidences() {
        // Create a second Residence for testing getAll.
        Residence secondResidence = ResidenceFactory.createResidence(
                "789 Third Ave",
                "Durban",
                "KwaZulu-Natal",
                "4000",
                "South Africa",
                1,
                101
        );
        repository.create(secondResidence);
        assertEquals(1, repository.getAll().size(), "Repository should have one Residence.");
        System.out.println("Total Residences: " + repository.getAll().size());
    }
}
