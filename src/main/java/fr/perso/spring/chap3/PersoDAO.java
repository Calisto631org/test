package fr.perso.spring.chap3;

public interface PersoDAO
{

	public Perso getPerso(String persoName);

	public int getNextValue(String persoName);

}
