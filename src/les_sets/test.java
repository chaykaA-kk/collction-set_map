package les_sets;

public class test {

	public static void main(String[] args) {
		Departement D= new Departement(1234);
		Employe E=new Employe(1111,"ryyyyheeeeeeem",4000,23);
		Employe E2=new Employe(2222,"chaaaayyyyyyyymmaaa",1500,33);
		D.ajoutEmploye(E);
		D.ajoutEmploye(E2);
		D.afficheDep();
	//	D.retirerEmploye(E);
		System.out.println(D.getEmpSalMax());
		Entreprise entreprise = new Entreprise("HHH");
		entreprise.ajoutDep(D);
		Departement D2=new Departement(5678);
        Employe E3=new Employe(3333, "BAHA", 2000, 5678);
        D2.ajoutEmploye(E3);
        entreprise.ajoutDep(D2);
        entreprise.afficheE();
        
        entreprise.UpdateDep(E, 567);
        entreprise.afficheE();
       // entreprise.retirerDep(D);
        entreprise.DepMinCapacity();

	}

}
