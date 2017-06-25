package fr.perso.spring.chap3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		PersoService persoService = (PersoService) context.getBean("persoService");

		System.out.println(persoService.generate("Cloud"));
		System.out.println(persoService.generate("Cloud"));
		System.out.println(persoService.generate("Squall"));

//		Personnage vaan = (Personnage) context.getBean("Vaan");
//		System.out.println(vaan.getSequence());
//		System.out.println(vaan.getSequence());
//

//		Personnage shantotto = (Personnage) context.getBean("Shantotto");
//		System.out.println(shantotto.getSequence());

		Personnage prishe = (Personnage) context.getBean("Prishe");
		System.out.println(prishe.getSequence());

//		Objet couronne = (Objet) context.getBean("Couronne");
//		System.out.println(couronne);
//		
//		Personnage firion = (Personnage) context.getBean("Firion");
//		System.out.println(firion.getSequence());
//		System.out.println(firion.getSequence());

//		Personnage lenna = (Personnage) context.getBean("Lenna");
//		System.out.println(lenna.getSequence());
//		System.out.println(lenna.getSequence());
		
//		System.out.println(((Personnage) context.getBean("Squall")).getSequence());
		
//		Classe mageNoir = (Classe) context.getBean("MageNoir");
//		System.out.println(mageNoir.getNomClasse());
	}

}
