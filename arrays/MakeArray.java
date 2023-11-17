public class MakeArray
{

public static void main(String[] args)
  {
  // Declare and create an int array
    int[] intArr = {1, 1, 2, 3, 5, 8};
    
    // Print the first 4 elements of the int array
    System.out.println(intArr[0]);
    System.out.println(intArr[1]);
    System.out.println(intArr[2]);
    System.out.println(intArr[3]);
    System.out.println(); 
    
    // Declare and create a double array
    double[] doubleArr = {1.2, 3.4, 4.5, 3.14};
    
     // Print the first 4 elements of the double array
    System.out.println(doubleArr[0]);
    System.out.println(doubleArr[1]);
    System.out.println(doubleArr[2]);
    System.out.println(doubleArr[3]);
    System.out.println(); 
    
    // Declare and create a boolean array
    boolean[] booleanArr = {true, false, false, true};
    
     // Print the first 4 elements of the boolean array
    System.out.println(booleanArr[0]);
    System.out.println(booleanArr[1]);
    System.out.println(booleanArr[2]);
    System.out.println(booleanArr[3]);
    System.out.println(); 
    
    // Declare and create a String array
    String[] stringArr = {"hello", "world", "Karel", "rocks"};

    String[] emptyStr = new String[10];

    for (int i=0;i<emptyStr.length;i++){
      System.out.println(emptyStr[i]);
    }
    emptyStr[1] = "Ben";

    for (String empt : emptyStr){
      System.out.println(empt);
    }
    
     // Print the first 4 elements of the String array
    System.out.println(stringArr[0]);
    System.out.println(stringArr[1]);
    System.out.println(stringArr[2]);
    System.out.println(stringArr[3]);

  }
}
