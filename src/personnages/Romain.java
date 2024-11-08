package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
		parler("J'abandonne...");
		}
	}
	
	public static void main(String[] args) {
		//Création de l'objet César
		Romain minus = new Romain ("Minus", 6);
		
		//Vérification de la méthode prendreParole
		minus.prendreParole();
		
		//Vérification de la méthode parler
		minus.parler("Je suis César !");
		
		//Vérification de la méthode recevoirCoup
		minus.recevoirCoup(2);
	}
}
	
	
	