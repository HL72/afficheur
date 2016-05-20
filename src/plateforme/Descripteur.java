package plateforme;

public class Descripteur {

	private String nom;

	public Descripteur(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "nom";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	
}
