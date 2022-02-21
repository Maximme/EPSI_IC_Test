package tests;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Calculs;

/**
 * @author test
 * 
 */
class CalculsTest {

	private Calculs c1 = null;
	private Calculs c2 = null;
	private Calculs c3 = null;
	
	/**
	 * Initialise les valeurs avant chaque test 
	 */
	@BeforeEach // Déclencher cette méthode avant l'ex�cution
	void setUp() throws Exception 
	{
		c1 = new Calculs(2,1);
		c2 = new Calculs(20,10);
		c3 = new Calculs(100,200);
	}

	

	/**
	 * Test method for {@link Calculs#multiplier()}.
	 */
	@Test
	void testMultiplier() 
	{
		assertEquals(c1.multiplier(), 2, "Methode multiplier non conforme 2*1=2 ne fonctionne pas.");
		assertEquals(c2.multiplier(), 200, "Methode multiplier non conforme 20*10=200 ne fonctionne pas.");
		assertEquals(c3.multiplier(), 20000, "Methode multiplier non conforme 100*200=20000 ne fonctionne pas.");

	}

	/**
	 * Test method for {@link Calculs#additionner()}.
	 */
	@Test
	void testAdditionner() {
		assertEquals(c1.additionner(), 3, "Methode additionner non conforme 2+1=3 ne fonctionne pas.");
		assertEquals(c2.additionner(), 30, "Methode additionner non conforme 20+10=30 ne fonctionne pas.");
		assertEquals(c3.additionner(), 300, "Methode additionner non conforme 100+200=300 ne fonctionne pas.");
	}

	/**
	 * Test method for {@link Calculs#diviser()}.
	 */
	@Test
	void testDiviser() {

		assertEquals(c1.diviser(), 2, "Methode diviser non conforme 2/1=2 ne fonctionne pas.");
		assertEquals(c2.diviser(), 2, "Methode diviser non conforme 20/10=2 ne fonctionne pas.");
		assertEquals(c3.diviser(), 0, "Methode diviser non conforme 100/200=0 ne fonctionne pas.");
	}

	/**
	 * Test method for {@link Calculs#soustraire()}.
	 */
	@Test
	void testSoustraire() {

		assertEquals(c1.soustraire(), 1, "Methode soustraire non conforme 2-1=1 ne fonctionne pas.");
		assertEquals(c2.soustraire(), 10, "Methode soustraire non conforme 20-10=10 ne fonctionne pas.");
		assertEquals(c3.soustraire(), -100, "Methode soustraire non conforme 100-200=-100 ne fonctionne pas.");
	}

}
