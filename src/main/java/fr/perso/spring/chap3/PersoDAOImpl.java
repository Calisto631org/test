package fr.perso.spring.chap3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("persoDAO")
public class PersoDAOImpl implements PersoDAO
{

	private Map<String, Perso> persos;
	private Map<String, Integer> values;

	public PersoDAOImpl() {
		persos = new HashMap<String, Perso>();
		persos.put("Cloud", new Perso("Cloud", 7, "SOLDAT"));
		persos.put("Squall", new Perso("Squall", 8, "SeeD"));
		values = new HashMap<String, Integer>();
		values.put("Cloud", 100);
		values.put("Squall", 800);
	}
	
	@Override
	public Perso getPerso(String persoName)
	{
		return persos.get(persoName);
	}

	@Override
	public synchronized int getNextValue(String persoName)
	{
		int value = values.get(persoName);
		values.put(persoName, value + 1);
		return value;
	}

}
