package fr.perso.spring.chap4;

public abstract class Personnage
{

	public static final Personnage CECIL = new Cecil("Cecil", "Paladin", 4);
	public static final Personnage LAGUNA = new Laguna("Laguna", "Shooter", 8);
	
	private String nom;
	private String classe;
	private int royaume;

	public Personnage() {
	}

	public Personnage(String nom, String classe, int royaume) {
		this.nom = nom;
		this.classe = classe;
		this.royaume = royaume;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getClasse()
	{
		return classe;
	}

	public void setClasse(String classe)
	{
		this.classe = classe;
	}

	public int getRoyaume()
	{
		return royaume;
	}

	public void setRoyaume(int royaume)
	{
		this.royaume = royaume;
	}
	
	@Override
	public String toString()
	{
		return "Je suis le " + classe + " " + nom + " du royaume " + royaume;
	}
}
