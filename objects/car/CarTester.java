public class CarTester {

  public static void main(String[] args) {
    Car poopcar = new Car(20.0, 15.0);

    poopcar.addGas();

    System.out.println(poopcar.milesLeft());
    poopcar.driveMiles(100.0);
    System.out.println(poopcar.milesLeft());
    poopcar.addGas(2.0);
    System.out.println(poopcar.milesLeft());
    poopcar.driveMiles(1000.0);
    poopcar.driveMiles(200.0);
    System.out.println(poopcar.getMiles());


    //Create a car that gets 20 mpg and has a 15 gallon tank
    
    //Fill up the gas tank
    
    //Check the miles available

    //Drive 100 miles

    //Check the miles available

    //Add 2 gallons to the gas tank

    //Check the miles available
    
    //Try driving more miles than available by driving 1000 miles

    //Drive 200 miles

    //Check how much gas you have left

    //Print total miles drivean

  }
}

