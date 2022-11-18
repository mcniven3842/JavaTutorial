package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testsuma() {
	 int resultado = Calculator.suma(2, 3);	
	 int esperado = 5; //2+3=5
	 assertEquals(esperado,resultado);
	}
	@Test
	public void testresta() {
	 int resultado = Calculator.resta(3, 2);	
	 int esperado = 1; //3-2=1
	 assertEquals(esperado,resultado);	
	}
	
	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}

}
