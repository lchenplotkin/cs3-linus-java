public class Player
{
  private String mark;

  public Player(String mark){
   this.mark = mark; 
  }

  public String getMark(){
    return mark;
  }

  public static addMark(int row, int col, mark){
    board[row][col] = mark;
  }
}
