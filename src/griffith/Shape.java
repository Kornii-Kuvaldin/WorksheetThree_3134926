package griffith;

public abstract class Shape {
	private String name;



	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract double area();

	abstract double perimeter();

	@Override
	public String toString() {
		return name;
	}

}
