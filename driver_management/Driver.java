package driver_management;
import behaviours.*;

public class Driver{
  private String name;
  private Driveable travel;

  public Driver(String name, Driveable travel){
    this.name = name;
    this.travel = travel;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getTravel(){
    return this.travel;
  }

  public int driveDistance(int distance){
    return this.travel.driveDistance(distance);

  }

}