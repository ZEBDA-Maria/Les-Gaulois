package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[]equipements=new Equipement[2];
	private int nbEquipement=0;
	
	
	public Romain(String nom, int force) {
	this.nom = nom;
	if (force>= 0) {
		this.force = force;
	}
	
		
	}
	public String getNom() {
	return nom;
	}
	public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
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
	
	public void ajouterEquipement(Equipement equipement) {
		equipements[nbEquipement]=equipement;
		nbEquipement ++;
		System.out.println("le soldat"+nom+"s'equipe avec un"+equipement+".");
	}
	
	
	
	
	public void sEquipier (Equipement equipement) {
		switch (nbEquipement) {
		case 2: {
			System.out.println("le soldat"+nom+"est deja bien protege!"  );
		  break;
		}
		case 1: {
			if (equipements[0]==equipement) {
				System.out.println("le soldat"+nom+"possede deja un"+equipement+"!");
			break;}
		
		else {
			ajouterEquipement(equipement);
			break;
		}
		}
		default :{
			ajouterEquipement(equipement);
			break;
		}
	}
	}
	public static void main (String[] args) {
		Romain Minus = new Romain ("le Romain",6);
		System.out.println(Minus.getNom());
		Minus.prendreParole();
		Minus.parler("Bonjour");
		Minus.recevoirCoup(6);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);	
		
}
}
