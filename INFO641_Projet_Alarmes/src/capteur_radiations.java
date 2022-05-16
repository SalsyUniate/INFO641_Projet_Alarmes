
public class capteur_radiations extends Capteurs{
	private int niveau;

	public capteur_radiations(String date, String localisation, String nvImportance, int niveau) {
		super(date, localisation, nvImportance);
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	
}
