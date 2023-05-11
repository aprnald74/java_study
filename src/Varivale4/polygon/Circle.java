package Varivale4.polygon;

public class Circle extends Polygon {

    protected final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getSize() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle("원", 5);
        double size = circle.getSize();
        System.out.println(size);
    }
}
