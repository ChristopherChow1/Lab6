<<<<<<< HEAD

public class Rectangle extends Shape {
	private double sideA;
	private double sideB;
	public Rectangle(String id, double sideA, double sideB) {
		super(id);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	public double getSideA(){
		return sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public double getPerimeter() {
		double perimeter = 2*(sideA+sideB);
		return perimeter;
	}
	public double getArea() {
		double area = sideA*sideB;
		return area;
	}
	public String getShapeType() {
		return "Rectangle";
	}
}
=======

public class Rectangle extends Shape {
	private double sideA;
	private double sideB;
	public Rectangle(String id, double sideA, double sideB) {
		super(id);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	public double getSideA(){
		return sideA;
	}
	public double getSideB() {
		return sideB;
	}
	public double getPerimeter() {
		double perimeter = 2*(sideA+sideB);
		return perimeter;
	}
	public double getArea() {
		double area = sideA*sideB;
		return area;
	}
	public String getShapeType() {
		return "rectangle";
	}
}
>>>>>>> 16196480229a911509b44404cb6e03cbfa544968
