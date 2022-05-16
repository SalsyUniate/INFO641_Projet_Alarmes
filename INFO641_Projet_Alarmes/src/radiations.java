import java.util.EventObject;

public class radiations extends AlarmeEvent{
	private Integer niveau;

	
	public radiations(String batiment, String type, Integer nvImportance, Integer niveau) {
		super(batiment, type, nvImportance);
		this.niveau = niveau;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	
	

}
