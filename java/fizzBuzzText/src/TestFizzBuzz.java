import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

	public FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void test() {
		assertNotNull(fizzBuzz);
	}
	
	
	@Test
	public void testFizz() {
		assertEquals("fizz", fizzBuzz.fizzBuzz(9));
	}
	
	@Test
	public void testBuzz() {
		assertEquals("buzz", fizzBuzz.fizzBuzz(20));
	}
	
	@Test
	public void testNumber() {
		assertEquals("13", fizzBuzz.fizzBuzz(13));
	}
	
	@Test
	public void testNotEqual() {
		assertNotEquals("buzz", fizzBuzz.fizzBuzz(9));
	}

}
