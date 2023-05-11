package Varivale4.polygon;

public abstract class Polygon {
    protected final String name;

    public Polygon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSize();



}
