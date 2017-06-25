package fr.perso.spring.chap3;

public class Objet
{

	private int royaume;
	private String name;

	public int getRoyaume()
	{
		return royaume;
	}

	public void setRoyaume(int royaume)
	{
		this.royaume = royaume;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name + " " + royaume;
	}

}
