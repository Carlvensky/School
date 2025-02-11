//time complexity id O(1)
class Shape {
    private double area;

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    void calculateArea() {
        System.out.println("Calculating area in Shape...");
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculateArea() {
        setArea(width * height);
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side); // Pass same value for width and height
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Shape square = new Square(4);
        square.calculateArea();
        System.out.println("Square Area: " + square.getArea());
    }
}
