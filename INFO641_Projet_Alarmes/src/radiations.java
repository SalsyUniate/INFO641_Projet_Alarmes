import java.util.EventObject;

public class radiations extends AlarmeEvent{
	private int niveau;

	public radiations(int niveau) {
		super();
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	

}
