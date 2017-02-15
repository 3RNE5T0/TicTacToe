import java.util.Scanner;

public class PlayTTT{
  
  public static void main(String[] args){
    
    
    
System.out.println ("                                 ");
System.out.println ("                _______________ ");
System.out.println ("                | How to play | ");
System.out.println ("                | Tic Tac Toe | ");
System.out.println ("                 ------------- ");
System.out.println ("                                   ");
System.out.println ("        1. Give your names. (player 1 is X and 2 is O) ");
System.out.println ("                        ");
    
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
    
    
    
    
    
    
    
System.out.println ( "                                                                                                            ");
System.out.println ( "    2. player 1 goes first picking a place to put their x ");
System.out.println ( "                                                                                                            ");
System.out.println ( "    3. player 2 goes fsecond picking a place to put their o ");
System.out.println ( "                                                                                                            ");
System.out.println ( "    4. This process continues until player 1 or 2 gets three of their variebules in a straight line");
System.out.println ( "                                                                                                            ");
System.out.println ( "    5. Things to know: ");
System.out.println ( "        - Do not enter the same #'s as the other player! ");
System.out.println ( "        - If someone enters something other than a # the game will turn off! ");
System.out.println ( "        - This is a work in progress game! ");
System.out.println ( "                                                                                                             ");
System.out.println ( "                                                                                                             ");

System.out.println ( "                                                     ");
System.out.println ( "                  0     1     2                      ");
System.out.println ( "                  |     |     |                      ");
System.out.println ( "                  v     v     v                      ");
System.out.println ( "                                                     ");
System.out.println ( "                     |      |                        ");
System.out.println ( "                  00 |  01  | 02     <----- 0        ");
System.out.println ( "               ---------------------                 ");
System.out.println ( "                     |      |                        ");
System.out.println ( "                  10 |  11  | 12     <----- 1        ");
System.out.println ( "               ---------------------                 ");
System.out.println ( "                     |      |                        ");
System.out.println ( "                  20 |  21  | 22     <----- 2        ");
System.out.println ( "                                                     ");
System.out.println ( "                                                     ");


    
    
    
    Board board = new Board();
    
    System.out.println("Test winner checker: " + board.TTTChecker());
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    int row = in.nextInt();
    int col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
    
    
    System.out.println("Player " + player2.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player2.getSymbol(), row, col);
    board.drawBoard();
    
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
    
    
    System.out.println("Player " + player2.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player2.getSymbol(), row, col);
    board.drawBoard();
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
    
    System.out.println("Player " + player2.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player2.getSymbol(), row, col);
    board.drawBoard();
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
    
    System.out.println("Player " + player2.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player2.getSymbol(), row, col);
    board.drawBoard();
    
    System.out.println("Player " + player1.getName() + ", give row and then column: ");
    row = in.nextInt();
    col = in.nextInt();
    
    board.makeMove(player1.getSymbol(), row, col);
    board.drawBoard();
  }
}