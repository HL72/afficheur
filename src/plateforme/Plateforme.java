package plateforme;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import afficheur.Afficheur;

public class Plateforme {
	
	private static Map<Descripteur, Class<?>> afficheurs = new HashMap<Descripteur, Class<?>>();
	
	private static Plateforme instance = null;

	private Plateforme() throws Exception {
		loadConfig("config.txt");
	}


	public static Plateforme getInstance() throws Exception {
		
		if(instance == null){
			instance = new Plateforme();
		}
		return instance;
	}
	
	public Afficheur getAfficheur(Descripteur desc) throws Exception {
		Class<?> afficheur = afficheurs.get(desc);
		return (Afficheur) Class.forName(afficheur.getName()).newInstance();
	}
	
	public Set<Descripteur> getDescripteurs() {
		return afficheurs.keySet();
	}
	
	private static void loadConfig(String filename) throws Exception {
		Properties p = new Properties();
		p.load(new FileReader(filename));
		Class<?> classAfficheur = null;
		Descripteur descAfficheur = null;
		for (Object key : p.keySet()) {
			if (key.equals("class")) {
				classAfficheur = Class.forName((String) p.get(key));
			}
			else {
				descAfficheur = new Descripteur((String) p.get(key));
			}
			if(descAfficheur != null && classAfficheur != null){
				afficheurs.put(descAfficheur, classAfficheur);
				descAfficheur = null;
				classAfficheur = null;
			}
			
		}
	}
	
}
