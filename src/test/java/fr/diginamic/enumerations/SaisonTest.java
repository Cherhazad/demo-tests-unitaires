package fr.diginamic.enumerations;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaisonTest {

	@Test
	void testValueOfLibelle() {
		Saison resultat = Saison.valueOfLibelle("Printemps");
		System.out.println("test value: " + resultat);
		assertEquals(Saison.PRINTEMPS, resultat);
	}
	
	@Test
	void testNullOfLibelle() {
		Saison resultatNull = Saison.valueOfLibelle("");
		System.out.println("test null : " + resultatNull);
		assertNull(resultatNull);
	}
	
	@Test
	void testNullOfLibelle2() {
		Saison resultatNull2 = Saison.valueOfLibelle("Juin");
		System.out.println("test null 2 : " + resultatNull2);
		assertNull(resultatNull2);
	}
	
}
