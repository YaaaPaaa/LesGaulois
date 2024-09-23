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
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
<<<<<<< HEAD
	@Override
=======
//	@Override
>>>>>>> 06c109d1fb94c58ea1954424f88f110265c4a274
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="+ effetPotion + "]";
//	}
	
	public static void main(String[] args) {
<<<<<<< HEAD
		eeee
=======
		
>>>>>>> 06c109d1fb94c58ea1954424f88f110265c4a274
	}
}