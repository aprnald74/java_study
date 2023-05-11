package Varivale4.polygon;

public class Triangle extends Rectangle{

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double getSize() {
        return super.getSize() / 2;
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle("삼각형", 1920, 1080);
        double size = triangle.getSize();
        System.out.println(size);
    }
}
