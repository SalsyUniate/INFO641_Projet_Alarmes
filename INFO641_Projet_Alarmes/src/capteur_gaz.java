
public class capteur_gaz extends Capteurs{

	private String typeEmis;

	public capteur_gaz(String date, String localisation, String nvImportance, String typeEmis) {
		super(date, localisation, nvImportance);
		this.typeEmis = typeEmis;
	}

	public String getTypeEmis() {
		return typeEmis;
	}

	public void setTypeEmis(String typeEmis) {
		this.typeEmis = typeEmis;
	}
	
	
	
}
