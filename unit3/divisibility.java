//This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.

import java.util.Scanner;

public class divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Dividend: ");
        int dividend = input.nextInt();
        System.out.print("Divisor: ");
        int divisor = input.nextInt();

        if (dividend % divisor == 0){
            System.out.println("Divisible!");
        }
        else {
            System.out.println("Not divisible!");
        }

    }
}

