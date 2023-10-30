public class Pinata
{
  // Instance variables
  private String candy;    // what kind of candy is inside
  private String color;    
  private String shape;

  // Constructor without parameters
  public Pinata()
  {
    candy = "hard candy";
    color = "rainbow";
    shape = "donkey";
  }
  
  //An overloaded constructor that allows the user to set all variables

  public Pinata(String inCandy,String inColor,String inShape){
    candy = inCandy;
    color = inColor;
    shape = inShape;
  }

  //An overloaded constructor that allows the user to customize the color and shape
  
  public Pinata(String inColor,String inShape){
    color = inColor;
    shape = inShape;
    candy = "hard candy";
  }

  //An overloaded constructor that allows the user to customize the candy
  
  public Pinata(String inCandy){
    candy = inCandy;
    color = "rainbow";
    shape = "donkey";
  }


  public String toString()
  {
    return color + " " + shape + " pinata filled with " + candy;
  }
}
