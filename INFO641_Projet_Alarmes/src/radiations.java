import java.util.EventObject;

public class radiations extends AlarmeEvent{
	private Integer niveau;

	
	public radiations(String batiment, String type, Integer nvImportance, Integer niveau) {
		super(batiment, type, nvImportance);
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "radiations [niveau=" + niveau + ", getNiveau()=" + getNiveau() + ", getBatiment()=" + getBatiment()
				+ ", getType()=" + getType() + ", getNvImportance()=" + getNvImportance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}
	
	

}
