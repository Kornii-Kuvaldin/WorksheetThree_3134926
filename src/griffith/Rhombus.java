package griffith;

public class Rhombus extends Shape {

	private double side;
	private double diagonal1;
	private double diagonal2;



	public Rhombus(String name, double side, double diagonal1, double diagonal2) {
		super(name);
		this.side = side;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (diagonal1*diagonal2)/2;
	}

	@Override
	public double perimeter() {
		return side*4;
	}

	@Override
	public String toString() {

		return "Rhombus side=" + side + ", diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + ", Name="+ getName();
	}



}
