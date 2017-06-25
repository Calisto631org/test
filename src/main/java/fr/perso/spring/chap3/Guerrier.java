package fr.perso.spring.chap3;

public class Guerrier implements Classe
{

	private String nom;

	public void setCategorieByLeader(String leader)
	{
		if ("Ashe".equals(leader))
		{
			this.nom = "Rebelle";
		} 
		else if ("Noctis".equals(leader))
		{
			this.nom = "Prince";
		}
		else
		{
			this.nom = "SeeD";
		}
	}

	@Override
	public String getNomClasse()
	{
		return "apprenti " + this.nom;
	}

	
}
