package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain ("Minus",6);
		
		asterix.prendreParole();
		asterix.parler("Bonjour à tous");
		
		minus.prendreParole();
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
