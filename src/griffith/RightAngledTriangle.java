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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "";
//		return "RightAngledTriangle sideA=" + sideA + ", sideB=" + sideB + ", Name=" + getName();
	}
	

}
