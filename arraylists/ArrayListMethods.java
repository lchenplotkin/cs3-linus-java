import java.util.ArrayList;

public class ArrayListMethods
{
  public static void condense(ArrayList<Double>values){
    for (int i=0; i<values.size()/2;i++){
      double newval = values.get(2*i)+values.get(2*i+1);
      values.set(i,newval);
    }

    int oldsize = values.size();
    for (int i=oldsize/2;i<oldsize;i++){
      values.remove(oldsize/2);
    }
    return;
  }

  public static void duplicate(ArrayList<Double>values){
    int size = values.size();
    for (int i=0;i<size;i++){
      double value = values.get(i);
      values.add(value);
    }
    return;
  }

  public static void print(ArrayList<Double> values){
    for (int i=0;i<values.size();i++){
      System.out.println(values.get(i));
    }
  }
}

