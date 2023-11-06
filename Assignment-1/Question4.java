package Assignment_1;
abstract class GeometricShape {
    public abstract double area();
    public abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle extends GeometricShape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}

public class Question4 {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[2];
        System.out.println("FOR TRIANGLE");
        shapes[0] = new Triangle(6.0, 4.0, 3.0, 4.0, 5.0);
        System.out.println("FOR RECTANGLE");
        shapes[1] = new Rectangle(5.0, 8.0);

        for (GeometricShape shape : shapes) {
            System.out.println("Area: " + shape.area());
            System.out.println("Perimeter: " + shape.perimeter());
            System.out.println();
        }
    }
}

