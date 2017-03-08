import java.util.Scanner;

public class PlayTTT{
  
  public static void main(String[] args){
    
  GamePlay gameplay = new GamePlay();
    gameplay.introsplash();
      
    Board board = new Board();
    Scanner in = new Scanner(System.in);
    //System.out.println("Test winner checker: " + board.TTTChecker());
    
    while(!board.TTTChecker()){
      
      board.playerMove(in, gameplay.playerTurn());
    }
    if(!gameplay.getplayer1().getIsTurn()){
      System.out.println(gameplay.getplayer1().getName() + " Won!!!!!!!");
    }
    else{
      System.out.println(gameplay.getplayer2().getName() + " Won!!!!!!!");
    } 
    
    }
  }