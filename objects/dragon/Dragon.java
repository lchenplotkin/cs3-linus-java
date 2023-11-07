public class Dragon
{
  private String attack;
  private int level;
  // Write the constructor here!

  public Dragon(int level, String attack){
    this.attack = attack;
    this.level = level;
  }

  // Put getters here

  public String getAttack(){
    return this.attack;
  }

  public int getLevel(){
    return this.level;
  }

  public void setAttack(String attack){
    this.attack=attack;
  }

  public void setLevel(int level){
    this.level=level;
  }

  // Put other methods here
  
  public String fight(){
    String fightStr = "";
    for (int i = 0; i<level; i++){
      fightStr+=this.attack;
    }
    return fightStr;
    
  }

  // String representation of the object
  public String toString()
  {
    return "Dragon is at level " + level + " and attacks with " + attack;
  }
}

