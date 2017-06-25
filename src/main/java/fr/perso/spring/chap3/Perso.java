package fr.perso.spring.chap3;

public class Perso
{

	private String name;
	private int royaume;
	private String classe;

	public Perso(String name, int royaume, String classe) {
		this.name = name;
		this.royaume = royaume;
		this.classe = classe;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getRoyaume()
	{
		return royaume;
	}

	public void setRoyaume(int royaume)
	{
		this.royaume = royaume;
	}

	public String getClasse()
	{
		return classe;
	}

	public void setClasse(String classe)
	{
		this.classe = classe;
	}

}
