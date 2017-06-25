package fr.perso.spring.chap4;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class PersonnageSynergiseFactoryBean extends AbstractFactoryBean<Personnage>
{

	private Personnage personnage;
	private boolean synergie;

	public void setPersonnage(Personnage personnage)
	{
		this.personnage = personnage;
	}

	public void setSynergie(boolean synergie)
	{
		this.synergie = synergie;
	}

	@Override
	public Class<? extends Personnage> getObjectType()
	{
		return personnage.getClass();
	}

	@Override
	protected Personnage createInstance() throws Exception
	{
		if (synergie)
		{
			personnage.setClasse(personnage.getClasse() + " puissante");
		}
		return personnage;
	}

}
