import java.util.Random;
import java.util.Scanner;

public class rockpaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean game = true;


        while (game==true){
          System.out.print("Rock paper scissors");
          char play=input.nextChar();
          int outcome= rand.nextInt(2); 
          
          if (outcome <4 ){
            if (play=='r'){
              System.out.println("PAPER!");
            } else if (play=='s'){
              System.out.println("ROCK!");
            } else {
              System.out.println("SCISSORS!");
            }
            System.out.println("YOU LOSE!");

            game=false;
          } 

        }
        }

}
