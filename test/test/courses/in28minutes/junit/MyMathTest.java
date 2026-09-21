package test.courses.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import courses.in28minutes.junit.MyMath;

class MyMathTest {
	MyMath math = new MyMath();

	@Test
	void calculateSum_ThreeNumbersArray() {
		assertEquals(6, math.sum(new int[] {1,2,3}));
	}

	@Test
	void calculateSum_EmptyArray() {
		assertEquals(0, math.sum(new int[] {}));
	}
	
}
