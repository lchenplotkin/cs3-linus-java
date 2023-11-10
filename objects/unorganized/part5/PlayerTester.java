import java.util.Random;
import java.lang.Math; // Needed to use Math.round()
public class PlayerTester
{
  public static void main(String[] args) {
    Random r = new Random();
    CricketPlayer brian = new CricketPlayer("Brian Lara", "GFS");
    CricketPlayer fabian = new CricketPlayer("Fabian Allen");

    double brianRun = 9.0;
    double brianBowl = 1.75;
    double fabianRun = 11.75;
    double fabianBowl = 20.25;

    for (int i =0;i<5; i++){
      int brianRuns = (int) Math.round(r.nextGaussian() * 3 + 9.0);
      int brianBowls = (int) Math.round(r.nextGaussian() * 3 +1.75);
      int fabianRuns = (int) Math.round(r.nextGaussian() * 3 + 11.75);
      int fabianBowls = (int) Math.round(r.nextGaussian() * 3 + 20.25);

      brian.addMatch(brianRuns, brianBowls);
      fabian.addMatch(fabianRuns, fabianBowls);

    }

    System.out.println(brian);
    System.out.println(fabian);

  }
}
/*Brian Lara's Stats: 
  Runs scored per match: 9.0
  Balls bowled per match: 1.75
  Brian Lara scored an average of 9.0 runs during these 4 matches.

  Fabian Allen's Stats: 
  Runs scored per match: 11.75
  Balls bowled per match: 20.25
  Fabian Allen scored an average of 11.75 runs during these 4 matches.*/
