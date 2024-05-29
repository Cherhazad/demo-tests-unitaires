package fr.diginamic.immobilier.entites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaisonTest {

	@Test
	void testAjouterPiece() {
		Maison palace = new Maison();

		Chambre chambre1 = new Chambre(1, 13.56);
		Chambre chambre2 = new Chambre(1, 0);
		Cuisine cuisine1 = new Cuisine(0, 25.98);
		SalleDeBain sdb1 = new SalleDeBain(0, 12);
		Salon salon1 = new Salon(0, 35.18);
		WC wc1 = new WC(1, 8.65);

		assertEquals(0, palace.getPieces().length);

		palace.ajouterPiece(chambre1);
		assertEquals(chambre1, palace.getPieces()[0]);
		
		

		palace.ajouterPiece(cuisine1);
		assertEquals(cuisine1, palace.getPieces()[1]);
		
		palace.ajouterPiece(chambre2); // ne s'ajoute pas grâce à la condition
		palace.ajouterPiece(sdb1);
		palace.ajouterPiece(salon1);
		palace.ajouterPiece(wc1);

		assertEquals(5, palace.getPieces().length);

	}

	@Test
	void testNbPieces() {

		Maison palace = new Maison();

		Chambre chambre1 = new Chambre(1, 13.56);
		Cuisine cuisine1 = new Cuisine(0, 25.98);
		SalleDeBain sdb1 = new SalleDeBain(0, 12);
		Salon salon1 = new Salon(0, 35.18);
		WC wc1 = new WC(1, 8.65);

		palace.ajouterPiece(chambre1);
		palace.ajouterPiece(cuisine1);
		palace.ajouterPiece(sdb1);
		palace.ajouterPiece(salon1);
		palace.ajouterPiece(wc1);

		assertEquals(5, palace.nbPieces());
	}

	@Test
	void testSuperficieEtage() {
		Maison palace = new Maison();

		Chambre chambre1 = new Chambre(1, 13.56);
		Cuisine cuisine1 = new Cuisine(0, 25.98);
		SalleDeBain sdb1 = new SalleDeBain(0, 12);
		Salon salon1 = new Salon(0, 35.18);
		WC wc1 = new WC(1, 8.65);

		palace.ajouterPiece(chambre1);
		palace.ajouterPiece(cuisine1);
		palace.ajouterPiece(sdb1);
		palace.ajouterPiece(salon1);
		palace.ajouterPiece(wc1);
		
		assertEquals(73.16, palace.superficieEtage(0));

	}

	@Test
	void testSuperficieTypePiece() {
		Maison palace = new Maison();

		Chambre chambre1 = new Chambre(1, 13.56);
		Chambre chambre2 = new Chambre(1, 20);
		Cuisine cuisine1 = new Cuisine(0, 25.98);
		SalleDeBain sdb1 = new SalleDeBain(0, 12);
		Salon salon1 = new Salon(0, 35.18);
		WC wc1 = new WC(1, 8.65);

		palace.ajouterPiece(chambre1);
		palace.ajouterPiece(chambre2);
		palace.ajouterPiece(cuisine1);
		palace.ajouterPiece(sdb1);
		palace.ajouterPiece(salon1);
		palace.ajouterPiece(wc1);
		
		assertEquals(33.56, palace.superficieTypePiece("Chambre"));
		
	}
	

	@Test
	void testCalculerSurface() {
		Maison palace = new Maison();

		Chambre chambre1 = new Chambre(1, 20);
		Chambre chambre2 = new Chambre(1, 20);
		Cuisine cuisine1 = new Cuisine(0, 20);
	

		palace.ajouterPiece(chambre1);
		palace.ajouterPiece(chambre2);
		palace.ajouterPiece(cuisine1);
	
		
		assertEquals(60, palace.calculerSurface());
	}

}
