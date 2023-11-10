public class Meal{
  private String name;
  private String course;
  private int servings;
  
  public Meal(String name, String course, int servings){
    this.name=name;
    this.course=course;
    this.servings=servings;
  }

  public String getName(){
    return name;
  }

  public String getCourse(){
    return course;
  }

  public int getNumberOfServings(){
    return servings;
  }

  public String toString(){
    return "Name: " + name + " Course: " + course + " Servings: " + servings;
  }
}
