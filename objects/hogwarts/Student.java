import java.util.Scanner;
public class Student{
  private String name;
  private int year;
  private String house;
  private int age;

  public Student(String name, String house, int year, int age){
    this.name = name;
    this.house = house;
    this.year = year;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public String getHouse(){
    return house;
  }

  public int getYear(){
    return year;
  }

  public int getAge(){
    return age;
  }

  public void setName(String name){
    this.name=name;
  }

  public void setHouse(String house){
    this.house=house;
  }

  public void setYear(int year){
    this.year=year;
  }

  public void setAge(int age){
    this.age=age;
  }

  public void sortHat(){
    Scanner input = new Scanner(System.in);
    System.out.println("Are you BRAVE? y/n");
    String ans=input.nextLine();
    if (ans.equals("y")){
      this.house="gryffindor";
    } else{
      System.out.println("Are you KIND? y/n");
      ans=input.nextLine();
      if (ans.equals("y")){
        this.house="hufflepuff";
      } else{
        System.out.println("Are you SMART? y/n");
        ans = input.nextLine();
        if (ans.equals("y")){
          this.house="Slytherin";
        }
      }
    }
  }

  public String getPersonality(){
    String firstlet = house.substring(0,1);
    if (firstlet == "g"){
      return "brave";
    } else if (firstlet == "h"){
      return "kind";
    } else if (firstlet == "r"){
      return "smart";
    } else if (firstlet =="s"){
      return "sly";
    } else{
      return "no personality";
    }
  }

  public String toString(){
    return this.name + " is a " + this.age + " year-old grade " + this.year + " " + this.house + ".";
  }
}
