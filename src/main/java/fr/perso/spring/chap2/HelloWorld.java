package fr.perso.spring.chap2;

import java.util.List;

public class HelloWorld
{

	private List<Personnage> personnages;

	private String message;

	public void setMessage(String message)
	{
		this.message = message;
	}

	public void setPersonnages(List<Personnage> personnages)
	{
		this.personnages = personnages;
	}

	public void hello()
	{
		System.out.println("Bonjour ! " + message);
	}

	public void lireListePerso()
	{
		for (Personnage perso : personnages)
		{
			System.out.println("Je suis " + perso.getNom() + " du royaume " + perso.getRoyaume());
		}
	}

}
