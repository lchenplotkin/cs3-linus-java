class StoreTester{
  public static void main(String args[]){
    Store[] storeList = new Store[3];

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


  }

  public void printInventories(Store[] storeList){
    for (Store store: storeList){
      for (Item item: store.getArray()){
        System.out.println(item.getname, item.getPrice);
      }
    }
  }
}
