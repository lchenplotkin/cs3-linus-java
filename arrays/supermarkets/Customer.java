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

  public Item[] getCart(){
    return shoppingCart;
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

  public void printCart(){
    for (int i=0;i<shoppingCart.length;i++){
      if (shoppingCart[i]!=null){
        System.out.print(shoppingCart[i].getName()+" ");
      } else{
        System.out.print("- ");
      }
    }
  }

  public void addToCart(int quantity, Item item){
    for (int i=0; i<shoppingCart.length; i++){
      if (shoppingCart[i]==null && quantity>0){
        shoppingCart[i]=item;
        quantity-=1;
      }
    }
  }

  public double checktotal(){
    double total = 0.0;
    for (int i=0; i<shoppingCart.length; i++){
      if (shoppingCart[i] != null){
        total += shoppingCart[i].getPrice();
      }
    }
    return total;
  }
}
