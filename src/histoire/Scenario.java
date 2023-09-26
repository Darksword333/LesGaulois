package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain randominus = new Romain("randominus", 5);
		asterix.parler("Bonjour à tous");
		randominus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(randominus);
		asterix.frapper(randominus);
		asterix.frapper(randominus);

	}

}
