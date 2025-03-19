//Kornii Kuvaldin 3134926
package griffith;

public class RightAngledTriangle extends Shape {

	private double sideA;
	private double sideB;
	
	
	public RightAngledTriangle(String name, double sideA, double sideB) { //Constructor
		super(name);
		this.sideA = sideA;
		this.sideB = sideB;
	}

	@Override
	public double area() { //Calculates area
		return (sideA*sideB)/2;
	}

	@Override
	public double perimeter() { //Calculates perimeter
		return sideA+sideB+Math.sqrt(sideA*sideA+sideB*sideB);
	}

	@Override
	public String toString() { //Description of triangle
		return "RightAngledTriangle sideA=" + sideA + ", sideB=" + sideB + ", Name=" + getName();
	}
	
	
	public double getSideA() { //Returns first catet
		return sideA;
	}

	public double getSideB() { //Returns second catet
		return sideB;
	}

	public double getHypotenuse() { //Returns hypotenuse
		return Math.sqrt(sideA*sideA+sideB*sideB);
	}
	

}
