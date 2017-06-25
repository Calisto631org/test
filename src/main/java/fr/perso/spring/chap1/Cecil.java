package fr.perso.spring.chap1;

public class Cecil implements Personnage
{

	@Override
	public void action(String commande)
	{
		if ("BSB".equals(commande))
		{
			System.out.println("Paladin Force");
		} else
		{
			System.out.println("Sainte Croix");
		}
	}

}
