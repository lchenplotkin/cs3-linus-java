import java.util.Scanner;

class StoreTester{
  public static void main(String args[]){

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

    System.out.println("Your total is: " +  usr.checktotal());

    
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
