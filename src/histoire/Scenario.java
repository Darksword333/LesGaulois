package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain randominus = new Romain("randominus", 5);
		asterix.parler("Bonjour � tous");
		randominus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(randominus);
		asterix.frapper(randominus);
		asterix.frapper(randominus);

	}

}
