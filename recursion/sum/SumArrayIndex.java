public class SumArrayIndex{
  public static int sum(int[] array, int n){
    if (n==0){
      return array[0];
    }
    return array[n] + sum(array, n-1);
  }

  public static void main(String[] args){
    int[] array = {32,13,2,0,7,0,3,2,5,3};
    int n = 5;
    System.out.println(sum(array,n));
  }
}
