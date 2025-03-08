package les_sets;

import java.util.HashMap;

public class Entreprise {
	private String nomEntreprise;
	HashMap<Integer, Departement> Liste_Deps;
	
	public Entreprise(String nomEntreprise) {
		this.nomEntreprise=nomEntreprise;
		Liste_Deps=new HashMap<>();
	
	}
	
	public void ajoutDep(Departement d)
	{
		Liste_Deps.put(d.getIdDep(), d);
	}
	
	public void retirerDep(Departement d)
	{
		Liste_Deps.remove(d.getIdDep());
	}
	public void afficheE()
	{
		System.out.println(nomEntreprise);
	}
	
	public void UpdateDep(Employe E, int idDep)
	{
		Departement ancien = null;
        for (Departement d:Liste_Deps.values()) {
            if (d.existeE(E.getCin())){
                ancien=d;
 
            }
        }
        if (ancien != null) {
            ancien.retirerEmploye(E);
        }
        if (Liste_Deps.containsKey(idDep)) {
            Liste_Deps.get(idDep).ajoutEmploye(E);
        }
		}
		//vérifier si un département donné en paramètre appartient à la société ou pas
	public boolean existeD(Departement d)
		{
		 return Liste_Deps.containsKey(d.getIdDep());
		}
		//afficher le département ayant le plus petit nombre d’étudiants
	public void DepMinCapacity()
		{
		 Departement minDep = null;
	        int minSize = Integer.MAX_VALUE;
		for (Departement d : Liste_Deps.values()) {
            int size=d.LEmployes.size();
            if (size<minSize) {
                minSize=size;
                minDep=d;
            }
        }
        if (minDep!=null) {
            minDep.afficheDep();
        }
		}

}
