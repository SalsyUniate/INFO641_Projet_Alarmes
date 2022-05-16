import java.util.EventObject;

public class AlarmeEvent{
	private String batiment;
	private String type;
	private Integer nvImportance;
	
	public AlarmeEvent(String batiment, String type, Integer nvImportance) {
		this.batiment = batiment;
		this.type = type;
		this.nvImportance = nvImportance;
	}

	public String getBatiment() {
		return batiment;
	}

	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getNvImportance() {
		return nvImportance;
	}

	public void setNvImportance(Integer nvImportance) {
		this.nvImportance = nvImportance;
	}
	
	
	
	
}
