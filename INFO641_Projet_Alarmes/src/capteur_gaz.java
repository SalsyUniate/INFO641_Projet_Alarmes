import java.util.ArrayList;

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
	
	public void createEvent(String batiment, String type, Integer nvImportance, String type_emis) {
		gaz_toxiques e = new gaz_toxiques(batiment, type, nvImportance, type_emis);
		for (int i = 0; i < alarmesTypeA.size(); i++) {
			alarmesTypeA.get(i).onEvent(e); 
			
		}
	}
	
	
	
}
