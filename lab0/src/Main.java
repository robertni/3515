import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initialize shapes
        Square square = new Square("Square");
        Circle circle = new Circle("Circle");
        Triangle triangle = new Triangle("Triangle");
        EquilateralTriangle eqTriangle = new EquilateralTriangle("EquilateralTriangle");

        Scanner keyboard = new Scanner(System.in); // we use this to get user input

        // get and set square dimensions
        System.out.println("Enter the length of the square: ");
        double length = keyboard.nextDouble();
        System.out.println("Enter the height of the square: ");
        double height = keyboard.nextDouble();
        square.setDimensions(length, height);

        // get and set circle dimensions
        System.out.println("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        circle.setDimensions(radius);

        // get and set triangle
        System.out.println("Enter the length of side A: ");
        double a = keyboard.nextDouble();
        System.out.println("Enter the length of side B: ");
        double b = keyboard.nextDouble();
        System.out.println("Enter the length of side C: ");
        double c = keyboard.nextDouble();
        triangle.setDimensions(a, b, c);

        // get and set equilateral triangle
        System.out.println("Enter the length of sides A/B/C: ");
        a = keyboard.nextDouble();
        eqTriangle.setDimensions(a);

        // print dimensions followed by area
        System.out.println("Name: " + square.getName());
        square.printDimensions();
        System.out.println("Area: " + square.getArea() + "\n");

        System.out.println("Name: " + circle.getName());
        circle.printDimensions();
        System.out.println("Area: " + circle.getArea() + "\n");

        System.out.println("Name: " + triangle.getName());
        triangle.printDimensions();
        System.out.println("Area: " + triangle.getArea() + "\n");

        System.out.println("Name: " + eqTriangle.getName());
        eqTriangle.printDimensions();
        System.out.println("Area: " + eqTriangle.getArea() + "\n");
    }

}
