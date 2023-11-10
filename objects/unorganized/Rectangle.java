public class Rectangle{
  // INSTANCE VARIABLES
  public int length;
  public int width;

// CONSTRUCTOR
public Rectangle(int rectLength, int rectWidth){
    length = rectLength;
    width = rectWidth;
  }

  public void area(){
    int area = length * width;
    System.out.println("Your area is: " + area);
  }

  public void perimeter(){
    int perimeter = 2 * length + 2 * width;
    System.out.println("Your perimeter is: " + perimeter);
  }

  
}
