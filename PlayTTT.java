import java.util.Scanner;

public class PlayTTT{
  
  public static void main(String[] args){
    
    //scanner for input
    Scanner in = new Scanner(System.in);
    
    //prompt user for name
    System.out.println("Player 1 give a name: ");
    
    //scanner grabs input and puts into nameP1
    String nameP1 = in.next();
    
    Player player1 = new Player('x', false, nameP1);
    
    System.out.println("Player 2 give a name: ");
    
    String nameP2 = in.next();
    
    Player player2 = new Player('o', false, nameP2);
    
    Board board = new Board();
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    int row = in.nextInt();
    int col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
  }
}