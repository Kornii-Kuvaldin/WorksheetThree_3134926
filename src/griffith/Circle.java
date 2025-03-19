//Kornii Kuvaldin 3134926
package griffith;

public class Circle extends Shape {

	private double radius;
	public Circle(String name, double radius) { //Constructor
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() { //return area
		return Math.PI*(radius*radius);

	}

	@Override
	public double perimeter() { //return perimeter
		return 2.0*Math.PI*radius;
	}

	@Override
	public String toString() { //description of circle
		return "Circle radius=" + radius + ", Name=" + getName();
	}

	public double getRadius() { //returns radius
		return radius;
	}

	
}
