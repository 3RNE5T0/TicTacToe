import java.util.Scanner;

public class PlayTTT{
  
  public static void main(String[] args){
    
  GamePlay gameplay = new GamePlay();
    gameplay.introsplash();
      
    Board board = new Board();
    Scanner in = new Scanner(System.in);
    //System.out.println("Test winner checker: " + board.TTTChecker());
    
    while(!board.TTTChecker()){
      System.out.println("Player " + gameplay.getPlayer1().getName() + ", give row and then column: ");
      int row = in.nextInt();
      int col = in.nextInt();

      board.makeMove(gameplay.getPlayer1().getSymbol(), row, col);
      board.drawBoard();

      System.out.println("Player " + gameplay.getPlayer2().getName() + ", give row and then column: ");
      row = in.nextInt();
      col = in.nextInt();

      board.makeMove(gameplay.getPlayer2().getSymbol(), row, col);
      board.drawBoard();

    }
  }
}