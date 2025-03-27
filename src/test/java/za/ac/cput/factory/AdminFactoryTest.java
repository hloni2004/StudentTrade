package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.*;
class AdminFactoryTest {
    public static Admin admin=AdminFactory.createAdmin(221630597,"Judina","221630597@mycput.ac.za","12345");
    public static Admin admin1=AdminFactory.createAdmin(221630597,"Jude","221630597mycput.ac.za","1234");

@Test
    public void testCreateAdmin(){
    assertNotNull(admin);

    System.out.println(admin.toString());
    }

    @Test
    public void testThatFails(){
    assertNotNull(admin1);
    }
}