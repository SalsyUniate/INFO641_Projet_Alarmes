import java.util.ArrayList;

public class Capteurs {
	private String date;
	private String localisation;
	private String nvImportance;
	private ArrayList<MoniteurListenerA> alarmesTypeA;
	private ArrayList<MoniteurListenerB> alarmesTypeB;
	
	
	public Capteurs(String date, String localisation, String nvImportance) {
		this.date = date;
		this.localisation = localisation;
		this.nvImportance = nvImportance;
		alarmesTypeA = new ArrayList<MoniteurListenerA>();
		alarmesTypeB = new ArrayList<MoniteurListenerB>();
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
	
	public void addListenerA(MoniteurListenerA unEcouteur) {
		alarmesTypeA.add(unEcouteur);
	}
	
	public void addListenerA(MoniteurListenerB unEcouteur) {
		alarmesTypeB.add(unEcouteur);
	}
	
	public void removeListenerA (MoniteurListenerA unEcouteur) {
        for (int i = 0; i < alarmesTypeA.size(); i++) {
            if (alarmesTypeA.get(i) == unEcouteur) {
                alarmesTypeA.remove(i);
            }
        }
	}
	
	public void removeListenerB (MoniteurListenerB unEcouteur) {
        for (int i = 0; i < alarmesTypeB.size(); i++) {
            if (alarmesTypeB.get(i) == unEcouteur) {
                alarmesTypeB.remove(i);
            }
        }
	}
	
}
