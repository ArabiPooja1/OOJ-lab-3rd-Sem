abstract class Shape {
    protected int side1;
    protected int side2;

    public Shape(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle: " + (side1 * side2));
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * side1 * side2));
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * side1 * side2));
    }
}

public class shape                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.printArea();

        Triangle triangle = new Triangle(4, 6);
        triangle.printArea();

        Circle circle = new Circle(3);
        circle.printArea();
    }
}
