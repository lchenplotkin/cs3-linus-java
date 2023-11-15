public class TeamTester
{
  public static void main(String[] args)
  {
      // Test out the Teams class here!
      
    Team.setMinTeams(2);

    Team blue = new Team();
    Team red= new Team();

    System.out.println(Team.tournamentReady());
  }
}



