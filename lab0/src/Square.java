public class Square extends Shape {

    private double length;
    private double height;

    public Square(String name) {
        super(name);
        this.length = 0.0;
        this.height = 0.0;
    }

    public void setDimensions(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void printDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }

}
