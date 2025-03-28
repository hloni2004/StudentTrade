package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;
import za.ac.cput.factory.AdminFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class AdminRepositoryTest {

   private static IAdminRepository repository =AdminRepository.getRepository();

   private Admin admin1= AdminFactory.createAdmin(1234,"Jud","221630597@mycput.ac.za","2468");


    @Test
    @Order(5)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @Order(1)
    void create() {
        Admin created =repository.create(admin1);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    @Order(2)
    void read() {
        Admin read=repository.read(admin1.getAdminID());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    @Order(4)
    void update() {
        Admin admin2= new Admin.Builder().copy(admin1).setName("Malee").build();
        Admin newAdmin;
        newAdmin = repository.update(admin2);
        assertNotNull(newAdmin);
        System.out.println(newAdmin.toString());

    }

    @Test
    @Order(3)
    void delete() {
        assertTrue(repository.delete(admin1.getAdminID()));
        System.out.println("This Admin has been deleted successfully ");
    }
}