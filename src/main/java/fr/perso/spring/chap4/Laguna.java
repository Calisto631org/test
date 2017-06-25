package fr.perso.spring.chap4;

public class Laguna extends Personnage
{

	String epoque;

	public Laguna() {
		super();
	}

	public Laguna(String nom, String classe, int royaume) {
		super(nom, classe, royaume);
	}

	public String getEpoque()
	{
		return epoque;
	}

	public void setEpoque(String epoque)
	{
		this.epoque = epoque;
	}
}
