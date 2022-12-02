package domain;

public abstract class Circle {
    private double radius;
    private double x;
    private double y;
    private String color;
    private String id;

    protected Circle(String id,String col, double r ,double x,double y){
        this.setId(id);
        this.setColor(col);
        this.setRadius(r);
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + " | Color: " + this.getColor() + " | Radius: " + this.getRadius();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
