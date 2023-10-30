import java.util.Random;
import java.lang.Math; // Needed to use Math.round()
public class PlayerTester
{
  public static void main(String[] args) {
    CricketPlayer brian = new CricketPlayer("Brian Lara", "GFS");
    CricketPlayer fabian = new CricketPlayer("Fabian Allen");

    for (int i =0;i<5; i++){
      Random r = new Random();
      int brianRuns = Math.round(9.0 * (double)(r.nextGaussian()));
      int brianBowls = Math.round(1.75 * (double)(r.nextGaussian()));
      int fabianRuns = Math.round(11.75 * (double)(r.nextGaussian()));
      int fabianBowls = Math.round((double)20.25 * (double)(r.nextGaussian()));

      brian.addMatch(brianRuns,brianBowls);
      fabian.addMatch(fabianRuns,fabianBowls);

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
