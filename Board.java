import java.util.Scanner;

public class Board{
  
  private char[][] board = {{' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
  
  public Board(){
  }

  public void makeMove(char symbol, int row, int col){
    board[row][col] = symbol;
  }
  //draws the board in terminal and shows where the person has made a move
  public void drawBoard(){

    System.out.println(" " + board[0][0] + " | " +  board[0][1] + " | " + board[0][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[1][0] + " | " +  board[1][1] + " | " + board[1][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[2][0] + " | " +  board[2][1] + " | " + board[2][2] + " ");
  }
  //code used to check all possible outcomes in the game, and decide the winner
  public boolean TTTChecker(){
    
    boolean winner = false;
    
     if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && board[0][0] != ' ')
      winner = true;
else if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && board[1][0] != ' ')
      winner = true;
else if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && board[2][0] != ' ')
      winner = true;
else if((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && board[0][0] != ' ')
      winner = true;
else if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && board[0][1] != ' ')
      winner = true;
else if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && board[0][0] != ' ')
      winner = true;
else if((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && board[0][0] != ' ')
      winner = true;
else if((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && board[0][2] != ' ')
      winner = true;
    else{
      winner = false;
      
      return winner;
    }
    //code allows the player to enter the location they want in the game
    public void playerMove(Scanner in, Player player){
      System.out.println("Player" + player.getName() + ", give row and then column: ");
      int row = in.nextInt();
      int col = in.nextInt();
     
      this.makeMove(player.getSymbol(), row, col);
      this.drawBoard();
      
    }
    
  }
     
}