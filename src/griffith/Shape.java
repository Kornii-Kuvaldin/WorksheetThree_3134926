//Kornii Kuvaldin 3134926
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
	public String toString() { //Prints name and returns it as well
		System.out.println(name);
		return name;
	}

}
