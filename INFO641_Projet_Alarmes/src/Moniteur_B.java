
public class Moniteur_B implements MoniteurListenerB{
	public String nom;
	
	public Moniteur_B (String unNom) {
		nom = unNom;
	}
	
    public void onEvent(gaz_toxiques e) {
        String res = e.toString();
        System.out.println(res);

    }

    public void onEvent(radiations e) {
        String res = e.toString();
        System.out.println(res);
        }
    

        

//Setters 

    public void setNom (String newNom) {
        nom = newNom;
    }

//Getters

    public String getNom () {
        return nom;
    }


}
