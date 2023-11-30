public class CarShowroom 
{
  public static void main (String[] args)
 {
   CarShowroom showroom = new CarShowroom(7);
   showroom.spaces[0] = new CarModel("Mustang", 157);
   showroom.spaces[1] = new CarModel("Camaro",155);
   showroom.spaces[3] = new CarModel("Corvette", 194);
   showroom.spaces[6] = new CarModel("Porsche", 210);

 // print out what is in the showroom
   System.
   // test output
   System.out.println("Index of Mustang should be 0 and is " + showroom.findCarSpace("Mustang"));
   System.out.println("Index of Corvette should be 3 and is " + showroom.findCarSpace("Corvette"));
   System.out.println("Index of Miata should be -1 and is " + showroom.findCarSpace("Miata"));
                      
   
   System.out.println("\nOriginal Car Showroom:");
   System.out.println(showroom);
   showroom.consolidate();
   System.out.println("Car Showroom after cars have been consolidated:");
   System.out.println(showroom);
 }
 
 private CarModel[] spaces;

 // constructor for number of spaces in showroom
 public CarShowroom(int numParkingSpaces)
 {
   spaces = new CarModel[numParkingSpaces];
 }

 // Returns index of space that contains the car with the specified model
 // and -1 if no car in the showroom is that model.No two cars in the showroom are the same model.

 public int findCarSpace(String name)
 {
   for (int i = 0; i<spaces.length; i++){
     if (spaces[i]!=null){
       if (name.equals(spaces[i].getName())){
       return i;
       }
     }
   }
   return -1;
      // your code goes here
 }
 
 // Consolidates cars in the showroom so that there are no gaps
 // in the parking spaces so that it's easier to move new models in
 
 public void consolidate()
 { 
  boolean consolidated = false;
  int i = 0;
  while (consolidated == false){
    if (spaces[i]!=null){
     i++; 
    }
    else {
      spaces[i]=spaces[i+1];
      spaces[i+1]=null;
    }
    

     // your code goes here
 }

 public String toString()
 {
String result = "";
   CarModel sp = null;
   
   // iterate through the spaces
   for (int i = 0; i < spaces.length; i++) 
   {
    sp = spaces[i];
     result = result + "Space " + i + " has a ";
     
     // locate empty spaces
     if (sp == null)
     {
          result = result + " null \n";
     }
     else result = result + sp.toString() + "\n";
   }
   return result;
 }
}
