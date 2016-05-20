package afficheurImpl;

import afficheur.Afficheur;

public class AfficheurJeremyImpl implements Afficheur {

	public AfficheurJeremyImpl() {

	}

	@Override
	public void afficher(Object o) {
		System.out.println(o+" jeremy");
	}

}
