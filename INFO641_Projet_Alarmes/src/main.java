import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moniteur_A ma = new moniteur_A("ma");
		Moniteur_B mb = new Moniteur_B("mb");
		
		incendies test = new incendies("a", "buyf", 14);

		ArrayList<AlarmeEvent> alarmesATraiter = new ArrayList<AlarmeEvent>();
		ArrayList<AlarmeEvent> alarmesTraitees = new ArrayList<AlarmeEvent>();
		ArrayList<AlarmeEvent> enAttente = new ArrayList<AlarmeEvent>();
		
	    new Simulation(alarmesATraiter, alarmesTraitees, enAttente);  
	    
	    System.out.println(test.toString());
	}
}

