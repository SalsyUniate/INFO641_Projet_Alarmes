import java.util.EventObject;

public class gaz_toxiques extends AlarmeEvent{
	private String type_emis;

	public gaz_toxiques(String type_emis) {
		super();
		this.type_emis = type_emis;
	}

	public String getType_emis() {
		return type_emis;
	}

	public void setType_emis(String type_emis) {
		this.type_emis = type_emis;
	}
	
	

}
