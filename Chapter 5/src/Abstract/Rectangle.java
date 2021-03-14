package Abstract;

public class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length= length;
    }

    double getWidth() {
		return width;
    }

    void setWidth(double width) {
		this.width = width;
    }

    double getLength() {
		return length;
    }

    void setLength(double length) {
		this.length = length;
    }

    double getArea() {
		return width*length;
    }

    double getPerimeter() {
		return 2*(width+length);
    }

    public String toString() {
        return "";
    }

}
