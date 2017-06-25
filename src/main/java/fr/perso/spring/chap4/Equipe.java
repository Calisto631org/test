package fr.perso.spring.chap4;

import java.util.ArrayList;
import java.util.List;

public class Equipe
{

	private List<Personnage> persos = new ArrayList<Personnage>();

	public void addPerso(Personnage personnage)
	{
		persos.add(personnage);
	}

	public List<Personnage> getPersos()
	{
		return persos;
	}

}
