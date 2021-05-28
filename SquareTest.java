package dvl_lab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		Square obj = new Square();
		int output = obj.square(2);
		assertEquals(4,output);	
	}

}
