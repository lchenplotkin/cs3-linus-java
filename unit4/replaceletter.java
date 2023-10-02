import java.util.Scanner;

public class replaceletter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String word = input.nextLine();
        System.out.print("Replace letter: ");
        String replace = input.nextLine();
        System.out.print("With letter: ");
        String replacer = input.nextLine();

        System.out.println(word);

        for(int i=0;i<word.length();i++)
        {
            if (replace.equals(word.substring(i,i+1))){
                word = word.substring(0,i)+replacer+word.substring(i+1);
            }
        }

        System.out.println(word);
    }
}


