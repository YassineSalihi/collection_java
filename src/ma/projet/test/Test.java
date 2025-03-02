package ma.projet.test;

import java.util.ArrayList;
import java.util.List;

import ma.projet.bean.Profile;
import ma.projet.bean.Utilisateur;
import ma.projet.impl.ProfileImpl;
import ma.projet.impl.UtilisateurImpl;

public class Test {
	public static void main(String[] args) {

		ProfileImpl pi = new ProfileImpl();
		pi.create(new Profile("CP", "Chef de projet"));
		pi.create(new Profile("MN", "Manager"));
		pi.create(new Profile("DP", "Directeur de projet"));
		pi.create(new Profile("DRH", "Directeur des ressources humaines"));
		pi.create(new Profile("DG", "Directeur général"));

		UtilisateurImpl ui = new UtilisateurImpl();
		ui.create(new Utilisateur("ALAMI", "Ahmed", "ahmed@gmail.com", "0612345678", 10000, "ahmed@gmail.com",
				"ahmed123", "Info", pi.getById(2)));

		ui.create(new Utilisateur("BERRADA", "Salim", "salim@gmail.com", "0661780244", 12000, "salim@gmail.com",
				"salim123", "Compta", pi.getById(2)));
		ui.create(new Utilisateur("SAFI", "Amal", "amal@gmail.com", "0651249600", 15000, "amal@gmail.com", "amal123",
				"Info", pi.getById(3)));
		ui.create(new Utilisateur("RADI", "Samir", "samir@gmail.com", "0681294430", 13000, "samir@gmail.com",
				"samir123", "Info", pi.getById(4)));
		ui.create(new Utilisateur("AHMADI", "Khalid", "khalid@gmail.com", "0612965677", 11000, "khalid@gmail.com",
				"khalid123", "Info", pi.getById(5)));

		for (Utilisateur u : ui.getAll()) {
			if (u.getProfile().getLibelle() == "Manager")
				u.afficher();
		}
	}


}