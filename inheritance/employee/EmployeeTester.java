public class EmployeeTester
{
    public static void main(String[] args)
    {
      HourlyEmployee mike = new HourlyEmployee("Mike", 20.0, 40.0);
      Employee karel = new Employee("Mr. Karel", 50000.000);

      System.out.println(mike);
      System.out.println(karel);

      System.out.println(mike.getAnnualSalary());
    }
}

