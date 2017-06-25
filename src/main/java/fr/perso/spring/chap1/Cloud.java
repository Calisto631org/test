package fr.perso.spring.chap1;

public class Cloud implements Personnage
{

	@Override
	public void action(String commande)
	{
		if ("BSB".equals(commande))
		{
			System.out.println("Omnislash v2");
		} else
		{
			System.out.println("Bravoure");
		}
	}
}
