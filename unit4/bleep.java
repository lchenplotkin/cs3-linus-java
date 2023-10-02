import java.util.Scanner;
import java.util.Random;

public class bleep{

    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int bleepchance = 50;

        System.out.print("Enter a string: ");
        String word = input.nextLine();
