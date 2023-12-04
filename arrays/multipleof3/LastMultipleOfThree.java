public class LastMultipleOfThree
{

  public static void main(String[] args)
  {
    int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
    System.out.println("The last multiple of 3 is " + findMultipleOfThree(numbers1));
    
  }
  
  public static int findMultipleOfThree(int[] arr)
  {
    int lastmult = -1;

    for (int num: arr){
      if (num % 3 == 0){
        lastmult = num;
      }
    }
    
    return lastmult;
    // your code goes here! 
  }
}
