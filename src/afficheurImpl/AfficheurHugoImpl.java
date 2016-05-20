package afficheurImpl;

import afficheur.Afficheur;

public class AfficheurHugoImpl implements Afficheur {

	public AfficheurHugoImpl() {

	}

	@Override
	public void afficher(Object o) {
		System.out.println(o+" hugo");
	}

}
