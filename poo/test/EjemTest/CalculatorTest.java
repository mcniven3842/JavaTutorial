package EjemTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator calculator;
	@BeforeClass
	public static void setupBeforeClass() {
		calculator = new Calculator();
	} 
	
	@Before
	public void setup() {
		//Calculator calculator = new Calculator();
		calculator.memoryClear();
	}
	
	@Test
	void testAdd() {
		/* instancia para asi poder llamar al metodo que se probara */
		// Calculator calculator = new Calculator();
		/*proporciona las variables que seran usadas por ese metodo */
		int a = 5000;
		int b= 1000;
		
		/* se define el valor esperado y con el cual se comparara */
		int expected = 6000;
		/* llama al metodo que se probara */
		int actual = calculator.add(a, b);
		
		/* Se realiza la comparacion  se valida que sean iguales */
		assertEquals(expected,actual);
	}
	
	@Test
	void testSubstrac() {
		/* instancia para asi poder llamar al metodo que se probara */
		// Calculator calculator = new Calculator();
		/*proporciona las variables que seran usadas por ese metodo */
		int a = 5000;
		int b= 1000;
		
		/* llama al metodo que se probara */
		int actual = calculator.subtrac(a, b);
		
		/* Se realiza la comparacion  se valida que sean iguales */
		assertTrue(actual == 4000);
	}
	
	
	@AfterClass
	public static void tearDownClass() {
		calculator = null;
	}

}
