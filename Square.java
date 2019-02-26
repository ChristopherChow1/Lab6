
public class Square extends Rectangle {
	private double side;

	public Square (String id, double side) {
		super(id, side, side);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public double getPerimeter() {
		return side*4;
	}
	public double getArea() {
		return side*side;
	}
	public String getShapeType() {
		return "Square";
	}
}
