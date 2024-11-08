package personnages;

import java.time.chrono.IsoChronology;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

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
		int forceDepart = force;
		force -= forceCoup;
		assert isForcePositive() : "la force d'un coup reçu est positive"; //TP2 Partie sur l'invariant
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert isForceDiminue(force, forceDepart) : "la force d'un Romain a diminué";
	}
	
	private boolean isForcePositive() {
			return 0 <= force;
	}
	
	private boolean isForceDiminue(int force1, int force2) {
		return force1<force2;
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
	
	
	