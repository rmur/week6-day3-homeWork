import static org.junit.Asser.*;
import org.junit.*;
import driver_management.*;
import behaviours.*

public class DodgemCarTest {

  DodgemCar car;

  @Before
  public void before(){
    car = new DodgemCar();
  }

  @Test
  public void driverDistanceREturnTime(){
    assrtEquals(100, car.driverDistance());
  }
}