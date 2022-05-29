import java.util.EventObject;

public class incendies extends AlarmeEvent{

	public incendies(String batiment, String type, Integer nvImportance) {
		super(batiment, type, nvImportance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bâtiment : " + getBatiment() + ", type : " + getType() + ", Niveau d'importance : "
				+ getNvImportance();
	}


	

}
