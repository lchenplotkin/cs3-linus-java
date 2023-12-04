public class Customer{
  private String name;
  private double money;

  public Customer(String name, double money){
    this.name=name;
    this.money=money;
  } 

  public String getName(){
    return name;
  }

  public double getMoney(){
    return money;
  }

  public void setName(String newName){
    name=newName;
  }

  public void setMoney(double newMoney){
    money=newMoney;
  }

  public void deductMoney(double deduction){
    money-=deduction;
  }


  }
