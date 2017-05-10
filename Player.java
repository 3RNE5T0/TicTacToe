public class Player{
  
  //player properties
  private char symbol;
  private boolean isWinner;
  private String name;
  private boolean isTurn;
  
  public Player(){
    
  }
  //controls the turns
  public Player(char newSymbol, boolean newIsWinner, String newName, boolean newIsTurn){
    
    symbol = newSymbol;
    isWinner = newIsWinner;
    name = newName;
    isTurn = newIsTurn;
  }
  //getters and turns
  public boolean getIsTurn(){
    return isTurn;
  }  
  public void setIsTurn(Boolean newIsTurn){
    isTurn = newIsTurn;
  }
    public char getSymbol(){
      return symbol;
    }
  public void setSymbol(char newSymbol){
    symbol = newSymbol;
  }
  //controls the winner
  public void setSymbol(boolean newIsWinner){
    isWinner = newIsWinner;
    }
  public boolean getIsWinner(){
      return isWinner;
    }
  //getters and setters
    public String getName(){
      return name;
    }
  
  public void setName(String newName){
    name = newName;
  }
  
   public String toString(){
    return symbol + " " + isWinner + " " + name + " " + isTurn;
   }
  
  }//end of class