package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {
	//Circle Tests
	@Test
	void testCircle() {
		Circle circle = new Circle("Alpha", 5.0);//Create circle named Alpha with radius of 5
		assertEquals(2.0*Math.PI*5, circle.perimeter()); //Perimeter test
		assertEquals(Math.PI*Math.sqrt(5.0), circle.area()); //Area test
		assertEquals("Circle radius=5.0, Name=Alpha", circle.toString()); //toString test
	}

	//Rhombus Tests
	@Test
	void testRhombus() {
		Rhombus rhombus = new Rhombus("Beta", 8, 12, 16);
		assertEquals(32.0, rhombus.perimeter());
		assertEquals(96.0, rhombus.area());
		assertEquals("Rhombus side=8.0, diagonal1=12.0, diagonal2=16.0, Name=Beta", rhombus.toString());
	}
	
	//Triangle Tests	
	@Test
	void testTriangle() {
		RightAngledTriangle triangle = new RightAngledTriangle("Gamma", 3, 4);
		assertEquals(12.0, triangle.perimeter());
		assertEquals(6.0, triangle.area());
		assertEquals("RightAngledTriangle sideA=3.0, sideB=4.0, Name=Gamma", triangle.toString());
	}

}
