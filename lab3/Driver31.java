interface Shape {
    double PI = 3.14;

    double calculateArea();

    double calculatePerimeter();
}

class Square implements Shape {
    private double length;
    private double width;

    public Square() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    //...

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Square: Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter();
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    //...

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter();
    }
}

class Circle implements Shape {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters and Setters
    //...

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: Area = " + calculateArea() + ", Perimeter = " + calculatePerimeter();
    }
}

public class Driver31 {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[3];

        // Populate the array with instances of Square, Rectangle, and Circle
        shapes[0] = new Square(5, 5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(3);

        // Iterate over the array and print shape information
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}