public class Customer{
  private String name;
  private double money;
  private Item[] shoppingCart = new Item[10];

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

  public void addToCart(int quantity, Item item){
    for (int i=0; i<shoppingCart.length; i++){
      if (shoppingCart[i]==null && quantity>0){
        shoppingCart[i]=item;
        quantity-=1;
      }
    }
  }

}
