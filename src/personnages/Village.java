package personnages;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois[] Villageois;
	private int nbVillageoisMaximum;
	
	
	public Village(String nom) {
	  this.nom = nom;
	  
	}
	
	
	public String getNom() {
	return nom;
	}
	public Village (String nom , int nbVillageoisMaximum) {
		this.nom=nom;
		this.Villageois=new Gaulois[nbVillageoisMaximum];
		this.nbVillageoisMaximum= nbVillageoisMaximum;}

    public void ajouterHabitant(Gaulois gaulois) {
    	if (nbVillageois <nbVillageoisMaximum) {
    		Villageois[nbVillageois]=gaulois;
    		nbVillageois ++ ;
    	}
    }

    public Gaulois trouveHabitant (int numero) {
    	return Villageois[numero];
    }
    
    public static void main (String[] args) {
    	Village village= new Village ("Village des irréductibles",30);
    
    Chef abraracourcix=new Chef("Abraracourcix",6,village);
    	
    Gaulois.asterix=new Gaulois ("Astérix",8);
    village.ajouterHabitant(asterix);
    Gaulois obelix =new Gaulois("obélix",25);
    village.ajouterHabitant(obelix);
    village.afficherVillageois();
    }
    public void afficherVillageois() {
    	System.out.println("Dans village du chef Abracourcix vivent les legendaires gaulois :");
    for (int i=0; i < nbVillageois; i++) {
    	System.out.println(Villageois[i]);
    }
    }
	
	}

 