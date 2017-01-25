public class Player{
  
  //player properties
  private char symbol;
  private boolean isWinner;
  private String name;
  
  public Player(){
    
  }
  
  public Player(char newSymbol, boolean newIsWinner, String newName){
    
    symbol = newSymbol;
    isWinner = newIsWinner;
    name = newName;
  }
    
    public char getSymbol(){
      return symbol;
    }
  
    public boolean getIsWinner(){
      return isWinner;
    }
  
    public String getName(){
      return name;
    }
  
   public String toString(){
    return symbol + " " + isWinner + " " + name;
   }
  
  }//end of class