package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	jUnitTesting t = new jUnitTesting();
	@Test
	public void test() {
		assertEquals(t.AddStrings("c","d"),"cd");
	}

}
