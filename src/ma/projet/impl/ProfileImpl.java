package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;

import ma.projet.bean.Profile;
import ma.projet.dao.IDao;

public class ProfileImpl implements IDao<Profile> {

	private List<Profile> profiles;

	public ProfileImpl() {
		profiles = new ArrayList<Profile>();
	}

	@Override
	public boolean create(Profile o) {
		return profiles.add(o);
	}

	@Override
	public boolean update(Profile o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Profile o) {
		return profiles.remove(o);
	}

	@Override
	public Profile getById(int id) {
		for (Profile p : profiles) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	@Override
	public List<Profile> getAll() {
		return profiles;
	}

}
