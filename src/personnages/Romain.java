package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
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
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		
		forceCoup = calculResistanceEquipement(forceCoup);
		
		force -= forceCoup;
		if (force==0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement saforce est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
					} else {
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
						}
				}
			texte += resistanceEquipement + "!";
			}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}
	
	private boolean isForcePositive() {
			return 0 <= force;
	}
	
	private boolean isForceDiminue(int force1, int force2) {
		return force1<force2;
		}
	
	private void sEquiper(Equipement aEquiper) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("Le soldat " + nom + " est déjà bien protégé");
			break;
		}
		case 1: {
			if(equipements[0] == aEquiper) {
				System.out.println("Le soldat " + nom + " possède déjà un " + aEquiper);
			} else {
				ajouterEquipement(aEquiper);
			}
			break;
		}
		case 0: {
			ajouterEquipement(aEquiper);	
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}
	
	private void ajouterEquipement(Equipement equipement) { 
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement.toString() + ".");
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
		
		//TP2 : 2)Des Romains bien protégés a)
		System.out.println("Les équipements sont :");
		for(Equipement equipement: Equipement.values()) {
			System.out.println("- " + equipement);
		}
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
	
	
	