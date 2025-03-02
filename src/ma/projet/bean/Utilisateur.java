package ma.projet.bean;

public class Utilisateur extends Personne {
	private String login;
	private String password;
	private String service;
	private Profile profile;

	public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire, String login,
			String password, String service, Profile profile) {
		super(nom, prenom, mail, telephone, salaire);
		this.login = login;
		this.password = password;
		this.service = service;
		this.profile = profile;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public void afficher() {
		System.out.println(this.id + " nom : " + this.nom + " prenom : " + this.prenom + " email : " + this.mail
				+ " telephone : " + this.telephone + " salaire : " + this.salaire + " service : " + this.service
				+ " profile : " + this.profile.getLibelle());

	}

}
