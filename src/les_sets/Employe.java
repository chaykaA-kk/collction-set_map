package les_sets;

import java.util.Objects;

public class Employe implements Comparable<Employe>{
	int  cin;
	private String nom;
	private double Salaire;
	private double iddep;
	public Employe(int  cin, String nom, double Salaire, double iddep) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.Salaire = Salaire;
		this.iddep = iddep;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return Salaire;
	}
	public void setSalaire(double salaire) {
		Salaire = salaire;
	}
	public double getIddep() {
		return iddep;
	}
	public void setIddep(double iddep) {
		this.iddep = iddep;
	}
	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", nom=" + nom + ", Salaire=" + Salaire + ", iddep=" + iddep + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cin);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return cin == other.cin;
	}
	public  int compareTo(Employe o) {
		if(Salaire>o.getSalaire()) {
			return 1 ;
		}
		if(Salaire <o.getSalaire()) {
			return -1;
		}
		return 0;
	}
	
	
	

}
