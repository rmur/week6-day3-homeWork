import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadBike;

  @Before
  public void before(){
    quadBike = new QuadBike(25, 150);
  }

  @Test
  public void averageSpeed(){
    assertEquals(1, quadBike.driveDistance(25));
  }
}