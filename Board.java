public class Board{
  
  private char[][] board = {{' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}};
  
  public Board(){
    
    
  }

  public void makeMove(char symbol, int row, int col){
    board[row][col] = symbol;
  }
  
  public void drawBoard(){

    System.out.println(" " + board[0][0] + " | " +  board[0][1] + " | " + board[0][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[1][0] + " | " +  board[1][1] + " | " + board[1][2] + " ");
    System.out.println("-----------");
    System.out.println(" " + board[2][0] + " | " +  board[2][1] + " | " + board[2][2] + " ");
  }
  
  public boolean TTTChecker(){
     if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && board[0][0] == "") 
      return true;
else if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && board[1][0] == "")
return true;
else if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && board[2][0] == "")
return true;
else if((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && board[0][0] == "")
return true; 
else if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && board[0][1] == "")
return true; 
else if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && board[0][0] == "")
return true; 
else if((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && board[0][0] == "")
return true; 
else if((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && board[0][2] == "")
return true;
    else{
      return false;
    }
  }
  
}