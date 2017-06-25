package fr.perso.spring.chap1;

public class Main
{

	public static void main(String[] args)
	{
		Container container = new Container();
		PersonnageService service = (PersonnageService) container.getComposants().get("personnageService");
		service.attaque();
	}

}
