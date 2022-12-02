package domain;

public abstract class Circle {
    private double radius;
    private String color;
    private String id;

    protected Circle(String id,String col, double r){
        this.setId(id);
        this.setColor(col);
        this.setRadius(r);
    }

    @Override
    public String toString() {
        String tempString = "Id: " + this.getId() + " | Color: " + this.getColor() + " | Radius: " + this.getRadius();
        return tempString;
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
}
