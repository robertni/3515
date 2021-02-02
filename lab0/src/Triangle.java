public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String name) {
        super(name);
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public void setDimensions(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c)/2;
        double inside = s * (s-a) * (s-b) * (s-c);
        return Math.sqrt(inside);
    }

    @Override
    public void printDimensions() {
        System.out.println("Side A: " + a);
        System.out.println("Side B: " + b);
        System.out.println("Side C: " + c);
    }

}
