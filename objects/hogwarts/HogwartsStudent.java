public class HogwartsStudent{
  private String name;
  private int year;
  private String house;
  private int age;

  public HogwartsStudent(String name, String house, int year, int age){
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
}
