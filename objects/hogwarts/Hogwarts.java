public class Hogwarts{
  public static void main(String[] args){
    Student harry = new Student("Harry Potter", "gryffindor", 4, 14);
    System.out.println(harry);
    harry.sortHat();
    System.out.println(harry);
  }
}
