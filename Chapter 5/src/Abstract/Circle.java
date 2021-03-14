package Abstract;

public class Circle extends Shape {
    private double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 3.14 * 2 * radius;
    }

    public String toString() {
        return "";
    }

}
