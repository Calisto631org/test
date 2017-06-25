package fr.perso.spring.chap3;

import java.util.List;

public class Personnage
{

	private List<Classe> classes;

	private int royaume;
	private int compteur;

	public Personnage() {
	}
	
	public Personnage(List<Classe> classes, int royaume) {
		this.royaume = royaume;
		this.classes = classes;
	}

	public Personnage(int royaume) {
		this.royaume = royaume;
	}

	public int getRoyaume()
	{
		return royaume;
	}

//	@Mandatory
	public void setRoyaume(int royaume)
	{
		this.royaume = royaume;
	}

	public List<Classe> getClasses()
	{
		return classes;
	}

	public void setClasses(List<Classe> classes)
	{
		this.classes = classes;
	}

	public synchronized String getSequence()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("Je suis ");
		for(Classe c : classes)
		{
			buffer.append(c.getNomClasse() + ", ");
		}
		buffer.append(compteur++ + " du royaume ");
		buffer.append(royaume);
		return buffer.toString();
	}

}
