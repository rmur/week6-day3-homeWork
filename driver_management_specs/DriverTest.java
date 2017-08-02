import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;


public class DriverTest {

  Driver driver;
  DodgemCar vehicle;

  @Before
  public void before(){
    vehicle = new DodgemCar(10);
    driver = new Driver("Russel", vehicle);
    
  }

  @Test
  public void testTravelTime(){
    assertEquals(10, driver.driveDistance(100));

  }

}