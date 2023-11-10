public class Car{
  private double fuel;
  private double milesDriven;
  private double mpg;
  private double capacity;

  public Car(double mpg, double capacity, double milesDriven, double fuel){
    this.mpg=mpg;
    this.capacity=capacity;
    this.fuel=fuel;
    this.milesDriven=milesDriven;
  }

  public Car(double mpg, double capacity){
    this.mpg=mpg;
    this.capacity=capacity;
    this.fuel=0.0;
    this.milesDriven=0.0;
  }

  public void addGas(){
    fuel=capacity;
    System.out.println("Filling up");
  }

  public void addGas(double amount){
    System.out.println("Filling up");
    if (fuel+amount>capacity){
      System.out.println("TOO MUCH GAS!");
    } else{
      fuel+=amount;
    }
  }

  public double milesLeft(){
    return fuel * mpg;
  }

  public void driveMiles(double miles){
    System.out.println("Driving");
    if (miles>this.milesLeft()){
      System.out.println("TOO MANY MILES!");
    } else {
      milesDriven+=miles;
    }
  }

  public double getMiles(){
    return milesDriven;
  }


}
