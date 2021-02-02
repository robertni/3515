public class EquilateralTriangle extends Shape {

    private double a;

    public EquilateralTriangle(String name) {
        super(name);
        this.a = 0.0;
    }

    public void setDimensions(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        double s = (a * 3)/2;
        double inside = s * (s-a) * (s-a) * (s-a);
        return Math.sqrt(inside);
    }

    @Override
    public void printDimensions() {
        System.out.println("Side A/B/C: " + a);
    }

}
