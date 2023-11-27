import java.util.*;
public class Median
{

  public static void main(String[] args)
  {
    int[] numbers1 = {12, 75, 3, 17, 65, 22};
    System.out.println("The median value of the EVEN array is " + median(numbers1));
    
    int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
    System.out.println("\nThe median value of the ODD array is " + median(numbers2));
      
  }

  public static double median(int[] arr)
  {
    Arrays.sort(arr);
    int arr_len=arr.length;
    if (arr_len % 2 == 0){
      int arr_ind = arr_len / 2;
      double ret = arr[arr_ind];
      return ret;
    } else{
      int ind1 = (arr_len+1)/2;
      int ind2 = (arr_len-1)/2;
      double ret = (arr[ind1] + arr[ind2])/2;
      return ret;
    }
  }
}
