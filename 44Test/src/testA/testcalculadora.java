package testA;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalculadora {

	@Test
	public void testSum() {
		Calculadora calc = new Calculadora();
		int resul = calc.add(3,2);
		int esper = 5;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAnsSum() {
		Calculadora calc = new Calculadora();
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper,resul);
	}

}
