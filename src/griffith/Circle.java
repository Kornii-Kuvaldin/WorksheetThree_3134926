package griffith;

public class Circle extends Shape {

	private double radius;
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*Math.sqrt(radius);

	}

	@Override
	public double perimeter() {
		return 2.0*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle radius=" + radius + ", Name=" + getName();
	}

	
}
