package application;

import java.util.Set;

import afficheur.Afficheur;
import plateforme.Descripteur;
import plateforme.Plateforme;

public class Application {

	private Plateforme p = Plateforme.getInstance();
	private Afficheur afficheur;
	
	public Application() throws Exception {
	    String name = "Afficheur simple";
		Set<Descripteur> descripteurs = p.getDescripteurs();
		for (Descripteur descripteur : descripteurs) {
			System.out.println(descripteur);
			if (descripteur.getNom().equals(name)) {
				afficheur = p.getAfficheur(descripteur);
			}
		}
		String s = "coucou";
		afficher(s);
	}

	public void afficher(Object o) {
		afficheur.afficher(o);
	}
	
	public static void main(String[] args) throws Exception {

		Application a = new Application();

	}
}
