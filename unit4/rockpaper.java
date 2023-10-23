import java.util.Random;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean game = true;


        while (game==true){
          System.out.print("Rock paper scissors");
          char play=input.nextLine();
          int outcome= rand.nextInt(2); 
          
          if (outcome == 0){
            if (play.equals("r"){
              System.out.println("PAPER!");
            } else if (play.equals("s")'){
              System.out.println("ROCK!");
            } else {
              System.out.println("SCISSORS!");
            }
            System.out.println("YOU LOSE!");

            game=false;
          } 

        if (outcome == 1){
          if (play.equals("r")){
            System.out.println("SCISSORS!");

          } else if (play.equals("p")){
            System.out.println("ROCK!");
          } else {
            System.out.println("PAPER!");
          }

          game=false;
        }

        if (outcome==2){
          if (play=='p'){
            System.out.println("PAPER!");
          } else if (play=='r'){
            System.out.println("ROCK!");
          } else {
            System.out.println("SCISSORS!");
          }
          System.out.println("TIE!");

        }

        }
        }

}
