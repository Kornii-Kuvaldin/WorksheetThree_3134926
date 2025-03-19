package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShapeTest {
	//Circle Tests
	@Test
	void testCircle() {
		Circle circle = new Circle("Alpha", 5.0);//Create circle named Alpha with radius of 5
		assertEquals(2.0*Math.PI*5, circle.perimeter(), 0); //Perimeter test
		assertEquals(Math.PI*25, circle.area(), 0); //Area test
		assertEquals("Circle radius=5.0, Name=Alpha", circle.toString()); //toString test
	}

	//Rhombus Tests
	@Test
	void testRhombus() {
		Rhombus rhombus = new Rhombus("Beta", 8, 12, 16);
		assertEquals(32.0, rhombus.perimeter(), 0);
		assertEquals(96.0, rhombus.area(), 0);
		assertEquals("Rhombus side=8.0, diagonal1=12.0, diagonal2=16.0, Name=Beta", rhombus.toString());
	}
	
	//Triangle Tests	
	@Test
	void testTriangle() {
		RightAngledTriangle triangle = new RightAngledTriangle("Gamma", 3, 4);
		assertEquals(12.0, triangle.perimeter(),0 );
		assertEquals(6.0, triangle.area(),0 );
		assertEquals("RightAngledTriangle sideA=3.0, sideB=4.0, Name=Gamma", triangle.toString());
	}

	@Test
	void integrationTest() {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle("Theta", 1));
		shapes.add(new Circle("Sigma", 30.5));
		shapes.add(new Rhombus("Ypsilon", 13, 10, 24));
		shapes.add(new Rhombus("Zeta", 17, 16, 30));
		shapes.add(new RightAngledTriangle("Tau", 5,12));
		shapes.add(new RightAngledTriangle("Rho", 8,15));
	}
}
