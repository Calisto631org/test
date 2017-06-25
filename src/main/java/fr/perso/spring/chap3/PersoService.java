package fr.perso.spring.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("persoService")
public class PersoService
{
	@Autowired
	private PersoDAO persoDAO;

	public void setPersoDAO(PersoDAO persoDAO)
	{
		this.persoDAO = persoDAO;
	}
	
	public String generate(String persoName)
	{
		Perso perso = persoDAO.getPerso(persoName);
		int value = persoDAO.getNextValue(persoName);
		return perso.getRoyaume() + " - " +  value + " " + perso.getClasse();
	}

}
