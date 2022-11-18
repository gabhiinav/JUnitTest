package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	jUnitTesting t = new jUnitTesting();
	@Test
	public void test() {
		assertEquals(t.AddNumbers(5,6),11);
	}
}
