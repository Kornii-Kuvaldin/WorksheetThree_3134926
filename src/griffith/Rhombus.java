//Kornii Kuvaldin 3134926
package griffith;

public class Rhombus extends Shape {

	private double side;
	private double diagonal1;
	private double diagonal2;



	public Rhombus(String name, double side, double diagonal1, double diagonal2) { //Constructor
		super(name);
		this.side = side;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	@Override
	public double area() {
		return (diagonal1*diagonal2)/2; //Calculate area according to rhombus formula
	}

	@Override
	public double perimeter() { //Calculate perimeter
		return side*4;
	}

	@Override
	public String toString() {
		return "Rhombus side=" + side + ", diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + ", Name="+ getName(); //Returns description of the object
	}

	public double getSide() { //returns side of rhombus
		return side;
	}

	public double getDiagonal1() { //returns first diagonal
		return diagonal1;
	}

	public double getDiagonal2() { //returns second diagonal
		return diagonal2;
	}



}
