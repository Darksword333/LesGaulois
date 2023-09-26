package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Romain randominus = new Romain("randominus", 5);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller préparer une petite potion...");
		int potion = panoramix.preparerPotion();
		panoramix.booster("Obélix");
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(potion);
		asterix.parler("Bonjour à tous");
		randominus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(randominus);
	}

}
