package testA;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testcalculadorab {

	
	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("After()");
		calc.clear();
	}
	
	@Test
	public void testSum() {
		System.out.println("sum()");
		int resul = calc.add(3,2);
		int esper = 5;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("AnsSum()");
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper,resul);
	}
}
