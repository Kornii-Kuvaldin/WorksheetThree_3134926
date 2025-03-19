package griffith;

public class RightAngledTriangle extends Shape {

	private double sideA;
	private double sideB;
	
	
	public RightAngledTriangle(String name, double sideA, double sideB) {
		super(name);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double area() {
		return (sideA*sideB)/2;
	}

	@Override
	public double perimeter() {
		return sideA+sideB+Math.sqrt(sideA*sideA+sideB*sideB);
	}

	@Override
	public String toString() {
		return "RightAngledTriangle sideA=" + sideA + ", sideB=" + sideB + ", Name=" + getName();
	}
	

}
