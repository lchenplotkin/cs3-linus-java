public class Pizza
{
  //instnce variables
  private int size;
  private String toppings;
  private String type;

  //constructor
  public Pizza(String pizzaType, String pizzaToppings, int pizzaSize){
    type = pizzaType;
    toppings = pizzaToppings;
    size = pizzaSize;
  }

  public Pizza(String pizzaType, int pizzaSize){
    type = pizzaType;
    size = pizzaSize;
  }
    
  // You don't need to do anything with this method
  // Used to print the object
  public String toString()
  {
      return size + " inch " + type + " pizza with " + toppings;
  }

  public String getType(){
    return type;
  }
  
  public String getToppings(){
    return toppings;
  }

  public int getSize(){
    return size;
  }

  public void setSize(int newSize){
    size = newSize;
  }

  public void setType(String newType){
    type = newType;
  }

  public void setToppings(String newToppings){
    toppings = newToppings;
  }
}
