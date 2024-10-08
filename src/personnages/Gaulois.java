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
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="+ effetPotion + "]";
	}
	
	public static void main(String[] args) {
		//Création de l'objet Astérix
		Gaulois asterix = new Gaulois ("Astérix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		//Vérification de la méthode prendreParole
		asterix.prendreParole();
		
		//Vérification de la méthode parler
		asterix.parler("Je suis Astérix !");
		
		//Création d'un objet romain et vérification de la méthode frapper 
		Romain cesar = new Romain("César", 2);
		asterix.frapper(cesar);
	}
}
