
public class moniteur_A implements MoniteurListenerA{
	public String nom;
	
	public moniteur_A (String unNom) {
		nom = unNom;
	}
	
    public void onEvent(gaz_toxiques e) {
        String res = e.toString();
        System.out.println(res);

    }

    public void onEvent(incendies e) {
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
