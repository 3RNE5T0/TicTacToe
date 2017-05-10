import java.util.Scanner;

public class GamePlay{
  //code shows who is player 1 and who is player 2
  private Player player1 = new Player('x', false, "", true);
  private Player player2 = new Player('o', false, "", false);
  
  public GamePlay(){
	 
	}
	//code shows player 1
	public Player getPlayer1(){
		return player1;
	}
	//code shows player 2
	public Player getPlayer2(){
		return player2;
	}
	//code gives players turns starting with player 1, then player 2, etc.
	public Player playerTurn(){
		if(player1.getIsTurn()){
			player1.setIsTurn(false);
			player2.setIsTurn(true);
			return player1;
		}
	else{
		player2.setIsTurn(false);
		player1.setIsTurn(true);
		return player2;
	}
		
	}
	
  public void introsplash(){
		
		//code showing the tirle to the game
System.out.println ("                                 ");
System.out.println ("                _______________  ");
System.out.println ("                | How to play |  ");
System.out.println ("                | Tic Tac Toe |  ");
System.out.println ("                 -------------   ");
System.out.println ("                                 ");
System.out.println (" 1. Give your names. (player 1 is X and 2 is O) ");
System.out.println ("                        ");
    //scanner inputs the name you choose to play as
    Scanner in = new Scanner(System.in);
    
    System.out.println("Player 1 give a name: ");
		
    String nameP1 = in.next();
    
		player1.setName(nameP1);
    //Player player1 = new Player('x', false, nameP1);
    
    System.out.println("Player 2 give a name: ");
    
    String nameP2 = in.next();
    
	 player2.setName(nameP2);
   // Player player2 = new Player('o', false, nameP2);
//rules or instructions for the players to see and use in the game
System.out.println ( "                                                                                                            ");
System.out.println ( "    2. Player 1 goes first picking a place to put their x ");
System.out.println ( "                                                                                                            ");
System.out.println ( "    3. Player 2 goes second picking a place to put their o ");
System.out.println ( "                                                                                                            ");
System.out.println ( "    4. This process continues until player 1 or 2 gets three of their variables in a straight line");
System.out.println ( "                                                                                                            ");
System.out.println ( "    5. Things to know: ");
System.out.println ( "        - Do not enter the same #'s as the other player! ");
System.out.println ( "        - If someone enters something other than a # the game will turn off! ");
System.out.println ( "        - This is a work in progress game! ");
System.out.println ( "                                                                                                            ");
System.out.println ( "                                                                                                            ");
		//code shows which number combinations is on which row + column
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

    
  }
  
}