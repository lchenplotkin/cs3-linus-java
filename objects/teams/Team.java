public class Team
{
  private static int totalTeams;
  private static int minTeams;
  // Static Variables
  // ...
  
  // Public Methods
  
  public static int getMinTeams(){
    return minTeams;
  }

  public static void setMinTeams(int toSet){
    minTeams=toSet;
  }

  public Team() 
  {
    totalTeams+=1;
      // Some code here...
  }
  
  public static boolean tournamentReady(){
    if (totalTeams<minTeams){
      return false;
    } else{
        return true;
      }
    }
}
  // Static Methods 

