package griffith;

public class Rhombus extends Shape {

	private double side;
	private double diagonal_1;
	private double diagonal_2;



	public Rhombus(String name, double side, double diagonal_1, double diagonal_2) {
		super(name);
		this.side = side;
		this.diagonal_1 = diagonal_1;
		this.diagonal_2 = diagonal_2;
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
//		return "Rhombus side=" + side + ", diagonal_1=" + diagonal_1 + ", diagonal_2=" + diagonal_2 + ", Name="
//				+ getName();
	}



}
