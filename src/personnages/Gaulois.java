package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans lamâchoire de " + romain.getNom());
		Equipement[] medaille = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; medaille != null && i < medaille.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = medaille[i];
			}
	}
	
	//Exercise [4]a)
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}
	
	public static void main(String[] args) {
		//Création de l'objet Astérix
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Druide panoramix = new Druide ("Panoramix",5,10);
		
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		//Vérification de la méthode prendreParole
		asterix.prendreParole();
		
		//Vérification de la méthode parler
		asterix.parler("Je suis Astérix !");
		
		//Exercise [4]b) Test de la méthode boirePotion
		asterix.boirePotion(panoramix.preparerPotion());
		
		//Création d'un objet romain et vérification de la méthode frapper 
		Romain cesar = new Romain("César", 2);
		asterix.frapper(cesar);
	}
}
