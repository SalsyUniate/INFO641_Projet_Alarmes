import java.util.EventObject;

public class radiations extends AlarmeEvent{
	private Integer niveau;

	
	public radiations(String batiment, String type, Integer nvImportance, Integer niveau) {
		super(batiment, type, nvImportance);
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "radiations niveau : " + niveau + ", niveau : " + getNiveau() + ", batiment : " + getBatiment()
				+ ", type : " + getType() + ", niveau d'importance : " + getNvImportance();
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	
	

}
