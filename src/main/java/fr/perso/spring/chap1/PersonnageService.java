package fr.perso.spring.chap1;

public class PersonnageService
{

	private Personnage personnage;

	public void setPersonnage(Personnage personnage)
	{
		this.personnage = personnage;
	}

	public void attaque()
	{
		personnage.action("Attaque classique");
	}

	public void limite()
	{
		personnage.action("BSB");
	}
}
