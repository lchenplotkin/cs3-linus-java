import java.util.Scanner;
public class TicTacToeTester
{
    //You don't need to alter any of the code in this class!
    //This is just to test that your TicTacToe class is working correctly
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe board = new TicTacToe();
        printBoard(board.getBoard());

        boolean gameOver = false;
        int row = 1;
        int col = 1;

        int[] computerPlay = {1,1}; 
        while (board.checkWinner().equals("-")){
          row = input.nextInt();
          col = input.nextInt();
          board.addMark(row,col, "X");
          printBoard(board.getBoard());

          if (board.checkWinner().equals("-")){
            board.addMark(board.choosePlay()[0],board.choosePlay()[1],"O");
            printBoard(board.getBoard());
          }

        }
        
        System.out.println(board.checkWinner());

    }
    

    public static void printBoard(String[][] array)
    {
        for(String[] row: array)
        {
            for(String play: row)
            {
                System.out.print(play + " ");
            }
            System.out.println();
        }
    }

}

