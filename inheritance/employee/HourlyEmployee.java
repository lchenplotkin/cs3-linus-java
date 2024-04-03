public class HourlyEmployee extends Employee {

    private double hoursPerWeek;

    // Call the Employee constructor and pass it a calculated annual salary
    
    
    public HourlyEmployee(String name, double hourlySalary, double hoursPerWeek){
      super(name, hoursPerWeek*hourlySalary*52.0);
      this.hoursPerWeek=hoursPerWeek;
    }
    
    // Get the annual salary from the superclass and convert it back
    // to hourly.
    public double getHourlySalary(){
      return super.getAnnualSalary()/hoursPerWeek/52.00;    
    }

    // Use the hourly salary input and convert it
    // to the annual salary and update in the superclass
    
    public void setHourlySalary(double hourlySalary){
       
    }

    /**
     * Example output:
     * Mike makes $18.0 per hour
     */
     
    public String toString(){
      return super.getName() + " makes $" + getHourlySalary() + " per hour";
        
    }
}

