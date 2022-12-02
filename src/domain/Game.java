package domain;

public class Game {
    Player player = new Player("player","black",20,250,250,200);
   public Game(){
   }

   public void printPlayer(){
       System.out.println(player);
   }
}
