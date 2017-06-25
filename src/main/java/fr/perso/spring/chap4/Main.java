package fr.perso.spring.chap4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");

//		Personnage best = (Personnage) context.getBean("bestPersonnage");
//		System.out.println(best);

//		PersonnageRanking ranking = (PersonnageRanking) context.getBean("personnageRanking");
//		System.out.println(ranking.getBestPersonnage());

		Personnage laguna = (Personnage) context.getBean("laguna");
		Personnage pecil = (Personnage) context.getBean("pecil");
		Personnage decil = (Personnage) context.getBean("decil");
		
//		System.out.println(laguna);
//		System.out.println(cecil);

		Equipe equipe1 = (Equipe) context.getBean("equipe");		
		equipe1.addPerso(pecil);
		equipe1.addPerso(decil);
		System.out.println(equipe1.getPersos());

		Equipe equipe2 = (Equipe) context.getBean("equipe");		
		equipe2.addPerso(laguna);
		equipe2.addPerso(pecil);
		System.out.println(equipe2.getPersos());
		
	}

}
