package personnages;

import personnages.Gaulois;
import java.util.*;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	
	public void booster(Gaulois gaulois) {
		if (gaulois.equals("Obélix")){//(gaulois.getNom() == "Obélix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique ! ");
		} else {
			gaulois.boirePotion(gaulois.getforce());
		}

	}

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int preparerPotion() {
		Random i = new Random();
		int forcePotion = i.nextInt(effetPotionMin, effetPotionMax);
		if (forcePotion >= 7) {
			System.out.println(prendreParole() + " J'ai préparér une super potion de force " + forcePotion);
		}

		else {
			System.out.println(prendreParole()
					+ " Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		System.out.println(Panoramix.getNom());
		Panoramix.preparerPotion();

	}
}
