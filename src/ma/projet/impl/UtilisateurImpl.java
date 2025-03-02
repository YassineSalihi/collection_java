package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.bean.Utilisateur;
import ma.projet.dao.IDao;

public class UtilisateurImpl implements IDao<Utilisateur> {

	private List<Utilisateur> utilisateurs;

	public UtilisateurImpl() {
		utilisateurs = new ArrayList<Utilisateur>();
	}

	@Override
	public boolean create(Utilisateur o) {
		return utilisateurs.add(o);
	}

	@Override
	public boolean update(Utilisateur o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Utilisateur o) {
		return utilisateurs.remove(o);
	}

	@Override
	public Utilisateur getById(int id) {
		for (Utilisateur u : utilisateurs) {
			if (u.getId() == id)
				return u;
		}
		return null;
	}

	@Override
	public List<Utilisateur> getAll() {
		return utilisateurs;
	}

}