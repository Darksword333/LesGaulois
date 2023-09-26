package personnages;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour je suis le druide " + nom + " ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParoles() + " « " + texte + " »");
	}

	public String prendreParoles() {
		return "Le druide " + getNom() + " : ";
	}

	public int preparerPotion() {
		Random r = new Random();
		int effetPotion = r.nextInt(effetPotionMax - effetPotionMin) + effetPotionMin;
		if (effetPotion >= 7) {
			parler("J'ai préparé une super potion de force " + effetPotion + " !");
		} 
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + effetPotion + ".");
		}
		return effetPotion;
	}

	public void booster(String gaulois){
		if (gaulois == "Obélix"){
			parler( "Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else {
			parler("Voici une potion magique pour toi " + gaulois + " !");
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Salut !");
		panoramix.preparerPotion();
		panoramix.booster("Obélix");
		panoramix.booster("Astérix");
	}
}
