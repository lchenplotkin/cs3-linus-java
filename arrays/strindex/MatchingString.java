public class MatchingString
{

  private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};
  
  public static int findString(String myString)
  {
    int i=0;
    for (String str : arr){
      if (str.equals(myString)){
        return i;
      }
      i++;
    }

    return -1;
    // your code goes here!
  }
}
