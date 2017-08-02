package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {
    private int averageSpeed;
    private int engineCapacity;
  
  public DodgemCar(int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveDistance(int distance){
    return distance / this.averageSpeed;
  }

}