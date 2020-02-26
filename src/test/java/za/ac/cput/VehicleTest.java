package za.ac.cput;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {

    Vehicle v1 = new Vehicle("Sabaru", 2010);
    Vehicle v2 = new Vehicle("Chevrolet", 2008);
    Vehicle v3 = new Vehicle("Sabaru", 2008);
    Vehicle v4 = new Vehicle("Chevrolet", 2010);

    @Test
    public void getvName() {
        assertEquals("Sabaru", v3.getvName());
    }

    @Test
    public void getvModel() {
        assertEquals(2005, v3.getvModel());
    }

    @Test(timeout=2)
    public void testTimeOut(){
        Vehicle v5 = new Vehicle("Toyota", 2020);
        String newVehicle = v5.getvName();
        int model = v5.getvModel();
        System.out.println(newVehicle + " "+ model);
    }

    @Ignore("Not done...")
    @Test
    public void test(){
        System.out.println("Not done...");
    }

}