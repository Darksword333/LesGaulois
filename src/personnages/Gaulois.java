package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParoles() + " � " + texte + " �");
	}

	private String prendreParoles() {
		return "Le gaulois " + getNom() + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " +  romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
		//System.out.println(asterix.getNom());
		asterix.parler("Salut !");
		Romain randominus = new Romain("randominus", 5);
		asterix.frapper(randominus);
		
	}
}
