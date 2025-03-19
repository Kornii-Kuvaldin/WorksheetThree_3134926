package griffith;

public class Circle extends Shape {

	private double radius;
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() {
		return 0;
	}

	@Override
	public double perimeter() {
		return 0;
		
	}

	@Override
	public String toString() {
		return "";
		//return "Circle radius=" + radius + ", Name=" + getName();
	}

	
}
