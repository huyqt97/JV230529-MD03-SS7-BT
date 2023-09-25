package BT4;

public class Entity {
    private static String name = "john";
    private static String classR = "CO2";

    public Entity(String name, String classR) {
        Entity.name = name;
        Entity.classR = classR;
    }

    public Entity() {
    }

    public void setName(String name) {
        Entity.name = name;
    }

    public void setClassR(String classR) {
        this.classR = classR;
    }
}
