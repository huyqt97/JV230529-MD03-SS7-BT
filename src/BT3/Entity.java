package BT3;

public class Entity {
    private double  radius = 1.0;
    private String color = "red";

    public Entity() {
    }

    public Entity(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
