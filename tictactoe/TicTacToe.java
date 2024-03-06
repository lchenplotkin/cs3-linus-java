public class TicTacToe
{
  String[] rowtemp = {"-","-","-"};

  private String[][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};

  public TicTacToe(){
    String[][] board = this.board;
  }

  public String[][] getBoard(){
    return board;
  }

  public String checkWinner(){
    String winner = null;
    if (board[0][0].equals(board[1][1])&&board[0][0].equals(board[2][2])){
      winner = board[0][0];
    } else if(board[0][2].equals(board[1][1])&&board[0][2].equals(board[2][0])){
      winner = board[0][2];
    } else{
      
      for (int i=0;i<3;i++){
        if (board[i][0].equals(board[i][1])&&board[i][0].equals(board[i][2])){
          winner = board[i][1];
        } else if(board[0][i].equals(board[1][i])&&board[0][i].equals(board[2][i])){
          winner = board[0][i];
        }
      }

    }


    if (winner.equals(null)){
      for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
          if (board[i][j].equals("-")){
            return null;
          }
        }
      }
    } else{
      return winner;
    }

  return "Game Over No Winner";
  }

    
  public void addMark(int row, int col, String mark){
    board[row][col] = mark;
}

  public int[] choosePlay(){
    int[] bestplay = new int[2];
    if (board[1][1]=="-"){
      bestplay = {1,1};
    } else {
      for (int i=0;i<3;i++){
        if (board[i][0].equals(board[i][2])){
          bestplay = {i,1};
        }
        else if (board[i][0].equals(board[i][1])){
          bestplay = {i,2};
        }
        else if (board[i][1].equals(board[i][2])){
          bestplay = {i,0};
        }
        else if (board[0][i].equals(board[2][i])){
          bestplay = {1,i};
        }
        else if (board[0][i].equals(board[1][i])){
          bestplay = {2,i};
        }
        else if (board[1][i].equals(board[2][i]){
          bestplay = {0,i};
      }
      }

      if bestplay == {0,0}{
         if (board[0][0].equals("-")){
          bestplay = {0,0};
        }
        else if (board[2][0].equals("-")){
          bestplay = {2,0};
        }
        else if (board[0][2].equals("-")){
          bestplay = {0,2};
        }
        else if (board[2][2].equals("-")){
          bestplay = {2,2};
        }
    }
    }
    return bestplay;
  }
}

//Create a TicTacToe class that initializes a 3x3 board of "-" values. We will use this class in future exercises to fully build out a Tic Tac Toe game!

//The TicTacToe class should have a 2D array as an instance variable and a constructor that initializes the 2D array with the "-" value.

//Add a getter method that returns the private 2D instance variable.
