package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	//Exercise [3]a)
	public int preparerPotion() {
		Random random = new Random ();
		forcePotion = random.nextInt(effetPotionMax+1);
		parler("Je vais aller préparer une petite potion...");
		while(effetPotionMin > forcePotion) //Exercise [3]c)
			forcePotion = random.nextInt(effetPotionMax+1);
		if (forcePotion > 7)
			parler("J'ai préparé une super potion de force " + forcePotion);
		else
			parler("Je n'ai pas trouvé tout les ingrédients, ma potion est seulement de force " + forcePotion);
		
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		if ("Obélix".equals(gaulois.getNom())) { 
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
			gaulois.parler("Par Bélénos, ce n'est pas juste !");
		} else { 
			gaulois.boirePotion(forcePotion); 
			}
	}
	
	//Exercise [3]b)
	public static void main(String[] args) {
		Druide panoramix = new Druide ("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}