public class Circle extends Shape {

    private double radius;

    public Circle(String name) {
        super(name);
        this.radius = 0.0;
    }

    public void setDimensions(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printDimensions() {
        System.out.println("Radius: " + radius);
    }

}
