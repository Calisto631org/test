package fr.perso.spring.chap4;

import java.util.Map;

public class PersonnageCreator
{

	private Map<String, Personnage> persos;

	public Personnage createPersonnage(String nomPerso)
	{
		Personnage personnage = persos.get(nomPerso);
		if (personnage != null)
		{
			return personnage;
		}
		throw new IllegalArgumentException("Perso inconnu");
	}

	public void setPersos(Map<String, Personnage> persos)
	{
		this.persos = persos;
	}

	public Map<String, Personnage> getPersos()
	{
		return persos;
	}

}
