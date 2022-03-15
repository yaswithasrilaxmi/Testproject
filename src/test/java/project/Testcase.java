package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcase {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Addition a=new Addition();
		int actual=a.sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
	}

}
