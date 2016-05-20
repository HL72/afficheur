package afficheurImpl;

import afficheur.Afficheur;

public class AfficheurImpl implements Afficheur {

	public AfficheurImpl() {

	}

	@Override
	public void afficher(Object o) {
		System.out.println(o+" jeremy");
	}

}
