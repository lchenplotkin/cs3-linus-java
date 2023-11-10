public class Chef{
  private String name;
  private String restaurant;
  private Meal bestmeal;

  public Chef(String name, String restaurant, Meal bestmeal){
    this.name=name;
    this.restaurant=restaurant;
    this.bestmeal=bestmeal;
  } 

  public String getName(){
    return name;
  }

  public String getRestaurant(){
    return restaurant;
  }

  public String getMealName(){
    return bestmeal.getName();
  }

  public String getMealCourse(){
    return bestmeal.getCourse();
  }

  public int getMealServings(){
    return bestmeal.getNumberOfServings();
  }

  public String toString(){
    return "Chef " + name + " works at " + restaurant + " and is best known for " + this.getMealName() + " (" + this.getMealCourse() + ")";
  }



}
