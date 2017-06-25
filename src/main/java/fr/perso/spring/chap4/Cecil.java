package fr.perso.spring.chap4;

public class Cecil extends Personnage
{

	private boolean isPaladin;

	public Cecil() {
		super();
	}

	public Cecil(String nom, String classe, int royaume) {
		super(nom, classe, royaume);
	}

	public boolean isPaladin()
	{
		return isPaladin;
	}

	public void setPaladin(boolean isPaladin)
	{
		this.isPaladin = isPaladin;
	}

}
