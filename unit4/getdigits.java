import java.util.Scanner;
public class getdigits

{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number:");
        int number = input.nextInt();
        if (number==0){
            System.out.println("0");
        }
        int subnum=1;
        int upto=0;

        while (number-subnum>0){
            subnum = subnum*10;
            System.out.println((number%subnum-upto)*10/subnum);
            upto = number%subnum;
        }


        
    }
}
