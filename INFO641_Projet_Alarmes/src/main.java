import java.util.ArrayList;

public class main {
	//EXÉCUTION GÉNÉRALE DU PROJET

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration des moniteurs
		moniteur_A ma = new moniteur_A("ma");
		Moniteur_B mb = new Moniteur_B("mb");
		
		//incendies test = new incendies("a", "buyf", 14);

		//Déclaration des différentes listes d'événements 
		ArrayList<AlarmeEvent> alarmesATraiter = new ArrayList<AlarmeEvent>();
		ArrayList<AlarmeEvent> alarmesTraitees = new ArrayList<AlarmeEvent>();
		ArrayList<AlarmeEvent> enAttente = new ArrayList<AlarmeEvent>();
		
		//lancement du programme 
	    new Simulation(alarmesATraiter, alarmesTraitees, enAttente);  
	    
	    //System.out.println(test.toString());
	}
} 

