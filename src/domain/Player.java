package domain;

public class Player extends Circle {

    private int hp;


     public Player(String id, String col, double r,double x, double y,int hp){
         super(id,col,r,x,y);
         this.setHp(hp);
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
