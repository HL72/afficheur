package afficheurImpl;

import afficheur.Afficheur;

public class AfficheurOlivierImpl implements Afficheur {

	public AfficheurOlivierImpl() {

	}

	@Override
	public void afficher(Object o) {
		System.out.println(o+" olivier");
	}

}
