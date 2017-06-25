package fr.perso.spring.chap3;

public class Mage implements Classe
{

	private String nom;

	public void setCategorieByLeader(String leader)
	{
		if ("Bibi".equals(leader))
		{
			this.nom = "Noir";
		} else
		{
			this.nom = "Blanc";
		}
	}

	@Override
	public String getNomClasse()
	{
		return "mage " + this.nom;
	}

}
