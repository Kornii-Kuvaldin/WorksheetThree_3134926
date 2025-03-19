package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {
	//Circle Tests
	@Test
	void testCircle() {
		Circle circle = new Circle("Alpha", 5);//Create circle named Alpha with radius of 5
		assertEquals(2.0*Math.PI*5, circle.perimeter());
		assertEquals(Math.PI*Math.sqrt(5.0), circle.area());
		assertEquals("Circle radius=5, Name=Alpha", circle.toString());
	}
}
