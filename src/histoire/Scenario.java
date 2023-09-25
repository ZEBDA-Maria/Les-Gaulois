package histoire;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Gaulois asterix =new Gaulois ("asterix",8);
	Gaulois ob =new Gaulois("Obelix",25);
	Romain Minus =new Romain("Minus",6);
	
	
	
	
	
    asterix.parler("Bonjour a tous");
    Minus.parler("UN GAU... UN GAUGAU...");
    asterix.frapper(Minus);
    asterix.frapper(Minus);
    asterix.frapper(Minus);
    Minus.recevoirCoup(8);
	}

}
