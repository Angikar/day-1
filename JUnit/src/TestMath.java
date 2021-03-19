import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMath {
	Math math;

	@BeforeEach
	void init() {
		math = new Math();
		System.out.println("init");
	}

	@Test
	void testAdd() {
		// Math math = new Math();
		int result = math.add(1, 2, 3);

		Assert.assertEquals(6, result);
	}

	// int result1 = new Math(-1,-2,-3);
	// Assert.assertEquals(-6, result1); this is wrong, since
	// program will not go to line 16 if first case is wrong
	void testAddWithNegative() {
		// Math math = new Math();
		int result1 = math.add(-1, -2, -3);
		Assert.assertEquals(-6, result1);
	}

	void testMultiply() { // test fails
		// Math math2 = new Math();
		int result2 = math.multiply(1, 2);
		Assert.assertEquals(2, result2);
	}

	@Test
	void testMultiplyWithZero() {

		int result3 = math.multiply(0, 2);

		Assert.assertEquals(0, result3);
	}

	@Test
		void testMultiplyWithOneNeg() {
			
		//	int result4 = math.multiply(-1,2);
			
		//	Assert.assertEquals(-2 , result4);
			Exception exception = assertThrows(IllegalArgumentException.class,()->{//lambda expression
			math.multiply(-1,2);
			});	
		}

}
