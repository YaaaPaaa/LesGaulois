package lieux;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Chef chef;
	private Gaulois[] villageois;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		int i = 0;
		while(i!=numeroVillageois) {
			i++;
		}
		return villageois[i];
	}
	
	public void afficherVillageois(String chef) {
		System.out.println("Dans village du chef " + chef + " vivent les légendaires gaulois :");
		int i=0;
		while(i<nbVillageois) {
			System.out.println("- " + villageois[i].getNom());
			i++;
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",25);
		
	
//		village.ajouterHabitant(abraracourcix);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois(abraracourcix.getNom());
		
//		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
		
		
		//Gaulois gaulois = village.trouverHabitant(30);
		//On obtient l'exception "Exception in thread "main" parce que on essaie de trouver le
		//Gaulois de l'indice 30 alors que cela ne parcours que de 0 à 29.
	}
}















