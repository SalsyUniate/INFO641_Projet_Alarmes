import java.util.EventObject;

public class gaz_toxiques extends AlarmeEvent{
	private String type_emis;

	public gaz_toxiques(String batiment, String type, Integer nvImportance, String type_emis) {
		super(batiment, type, nvImportance);
		this.type_emis = type_emis;
	}

	@Override
	public String toString() {
		return "gaz_toxiques, type émis : " + getType_emis() + ", bâtiment : "
				+ getBatiment() + ", type : " + getType() + ", niveau d'importance : " + getNvImportance();
	}

	public String getType_emis() {
		return type_emis;
	}

	public void setType_emis(String type_emis) {
		this.type_emis = type_emis;
	}


	
	

}
