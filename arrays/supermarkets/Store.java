public class Store{
  private String name;
  private Item[] inventory = new Item[10];

  public Store(String name, Item[] array){
    this.name = name;
    for (i=0; i<array.length; i++){
      this.inventory[i]=array[i];
    }
  }

  public String getName(){
    return name;
  }

  public Item[] getArray(){
    return inventory;
  }

  public void setName(String newName){
    name=newName;
  }

  public void setArray(Item[] array){
    for (i=0; i<array.length; i++){
      inventory[i] = array[i];
    }
  }
}
