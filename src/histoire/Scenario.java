package histoire;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Gaulois asterix =new Gaulois ("asterix",8);
	Gaulois Obélix =new Gaulois("Obélix",25);
	Romain Minus =new Romain("Minus",6);
	Druide Panoramix =new Druide ("Panoramix",5,10);
	
	
	
	
	
    Panoramix.parler(" Bonjour, je suis le druide Panoramix et ma potion peut aller d'une force 5 à 10");
	Panoramix.parler("Je vais aller préparer une petite potion...");
    Panoramix.preparerPotion();
    Panoramix.booster(Obélix);
    Obélix.parler(" Par Bélénos, ce n'est pas juste !");
    asterix.parler( " Merci Druide, je sens que ma force est 6 fois décuplée");
	asterix.parler("Bonjour a tous");
    Minus.parler("UN GAU... UN GAUGAU...");
    asterix.frapper(Minus);
    asterix.frapper(Minus);
    asterix.frapper(Minus);
    Minus.recevoirCoup(8);
	}

}
