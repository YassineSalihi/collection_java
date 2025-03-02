package ma.projet.bean;

public class Personne {

	protected int id;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String telephone;
	protected double salaire;
	public static int comp = 0;

	public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double calculerSalaire() {
		return salaire;
	}

	public void afficher() {

	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", telephone="
				+ telephone + ", salaire=" + salaire + "]";
	}
}
