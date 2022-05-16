
public class Capteurs {
	private String date;
	private String localisation;
	private String nvImportance;
	
	
	public Capteurs(String date, String localisation, String nvImportance) {
		super();
		this.date = date;
		this.localisation = localisation;
		this.nvImportance = nvImportance;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public String getNvImportance() {
		return nvImportance;
	}


	public void setNvImportance(String nvImportance) {
		this.nvImportance = nvImportance;
	}
	
	

}
