import java.util.ArrayList;
class BasicTest{


  public static void main(String[] args){

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(444);
    int size = nums.size();
    for (int i=0;i<size;i++){
      System.out.println(nums.get(i));
    }

  }
}
