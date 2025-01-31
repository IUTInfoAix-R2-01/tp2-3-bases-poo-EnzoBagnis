package prof;

public class Personne {
	private String nom;
	private String prenom;
	
	public Personne() {
		nom = "wick";
		prenom = "John";
	}
	
	public Personne(String nom, String prenom){
		this.nom = nom;
		this.prenom = prenom;		
	}
	
	public Personne(String prenom) {
		nom = "Wick";
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String toString() {
		if (this.nom == null) {
			return "Personne [prénom="+ prenom + "]";
		}
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
		
}
