import java.util.Scanner;

class StoreTester{
  public static void main(String args[]){

    String[] states = {"AL", "AK","AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY","D.C"};
    double[] taxes = {4.0,0.0,5.6,6.5,7.25,2.9,6.35,0.00,6.00,4.00,4.00,6.00,6.25,7.00,6.00,6.50,6.00,4.45,5.50,6.00,6.25,6.00,6.88,7.00,4.23,0.00,5.50,6.85,0.00,6.63,4.88,4.00,4.75,5.00,4.75,0.00,6.00,7.00,6.00,4.20,7.00,6.25,6.10,6.00,5.30,6.50,6.00,5.00,4.00,6.00};

    System.out.println(states.length);
    System.out.println(taxes.length);

    Scanner input = new Scanner(System.in);

    Item banana = new Item("Banana", 0.62);
    Item apple = new Item("Apple", 1.32);
    Item tPaper = new Item("Toilet Paper", 14.88);
    Item dFood= new Item("Dog Food", 49.49);
    Item chips = new Item("Potato Chips", 5.26);
    Item ppTowl = new Item("Paper Towels", 15.87);
    Item donut = new Item("Donut", 0.99);
    Item envelope = new Item("Envelope", 0.58);
    Item pineapple = new Item("Pineapple", 0.65);

    Item[] walmartList = {banana, apple, tPaper, dFood, chips, ppTowl, donut, envelope, pineapple}; 

    Item screws = new Item("Screws", 7.47);
    Item hammer = new Item("Hammer", 9);
    Item scrwDrive = new Item("Screwdriver", 18);
    Item snowBlow = new Item("Snow Blower", 549);
    Item wood = new Item("Wood", 2.89);

    Item[] lowesList = {screws, hammer, scrwDrive, snowBlow, wood};

    Item roses = new Item("Roses", 30);
    Item carnation = new Item("Carnation", 1.20);
    Item daisies = new Item("Dasies", 30);
    Item pansies = new Item("Pansies", 19.98);
    Item tulip = new Item("Tulip", 30);

    Item[] flowerList = {roses, carnation, daisies, pansies, tulip};

    Store walmart = new Store("Walmart", walmartList);
    Store lowes = new Store("Lowes", lowesList);
    Store flowershop = new Store("Flower Shop", flowerList);

    Store[] storeList = {walmart, lowes, flowershop};

    Customer usr = new Customer("User", 100);
    for (Store store: storeList){
      System.out.print(store.getName()+ " ");
    }

    System.out.println("Which store do you want to go to? 1, 2, or 3?");
    

    int index = input.nextInt() - 1;
    if (index>=storeList.length || index<0){
      System.out.println("Please enter valid index next time!");
      System.exit(0);
    }
    Store[] storeList2 = {storeList[index]};
    printInventories(storeList2);

    int itemindex = -2;
    while (itemindex !=-1){
      System.out.print("Current cart: ");
      usr.printCart();
      System.out.println("Which item do you wish to add to cart? 1,2,3,4... or 0 for nothing.");
      itemindex = input.nextInt()-1;
      if (itemindex == -1){
        System.out.println("Thank you for shopping with us today!");
      } else{
        System.out.println("How many of this item do you wish to add to cart?");
        int itemquant = input.nextInt();
        usr.addToCart(itemquant,storeList[index].getArray()[itemindex]);
      }
    }

    for (int i=1;i<=states.length;i++){
      System.out.println(i + " " + states[i-1]);
    }

    System.out.println("Which state do you live in? 1-51)");

    int stateindex = input.nextInt()-1;
    double salestax = taxes[stateindex] * 0.01;
    double total = usr.checktotal();
    total += total*salestax;
    

    System.out.println("Your total is: " + total); 

    
}

  public static void printInventories(Store[] storeList){
    for (Store store: storeList){
      int i = 1;
      for (Item item: store.getArray()){
        if (item != null){
          System.out.println(i + " "+ item.getName() + " " + item.getPrice());
          i+=1;
        }
      }
    }
  }

}




//Walmart
//Items:
//"Banana", 0.62
//"Apple", 1.32
//"Toilet Paper", 14.88
//"Dog Food", 49.49
 //"Potato Chips", 5.26
//"Paper Towels", 15.87
//"Donut", .99
//"Envelope", 0.58
//"Pineapple", 0.65
//Lowes
//Items:
//"Screws", 7.47
//"Hammer", 9
//"Screwdriver", 18
//"Snow Blower", 549
//"Wood", 2.89
//Flower Shop
//Items:
 //"Roses", 30
 //"Carnation", 1.20
 //"Daisies", 30
//"Pansies", 19.98
////"Tulip", 35


/*
  public void printInventories(Store[] storeList){
    for (Store store: storeList){
      for (Item item: store.getArray()){
        System.out.println(item.getname, item.getPrice);
      }
    }
  }
  */
