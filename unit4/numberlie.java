import java.util.Scanner;
import java.util.Random;
public class numbergame
{ 
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);

        int randnum = (int)(Math.random()*100);

        boolean fail=true;
        int tries = 10;

        while (tries > 0){
            System.out.print("Guess the number: ");
            int guess = input.nextInt();
            if (guess<randnum){
                System.out.println("Too low!");
            } else if (guess>randnum){
                System.out.println("Too high!");
            } else {
                System.out.println("You guessed it!");
                fail=false;
                break;
            }
            tries--;
        }

        if (fail==true){
            System.out.println("You have run out of attempts.");
        }
    }
    
   
}



