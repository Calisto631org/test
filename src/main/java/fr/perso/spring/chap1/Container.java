package fr.perso.spring.chap1;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.beanutils.PropertyUtils;

public class Container
{

	private Map<String, Object> composants;

	public Container() {
		composants = new HashMap<String, Object>();
		try
		{
			Properties properties = new Properties();
			InputStream resource = Container.class.getResourceAsStream("/fr/perso/spring/chap1/chap1.properties");
			properties.load(resource);
			for (Map.Entry entry : properties.entrySet())
			{
				String key = (String) entry.getKey();
				String value = (String) entry.getValue();
				processEntry(key, value);
			}
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	public Map<String, Object> getComposants()
	{
		return composants;
	}

	private void processEntry(String key, String value) throws Exception
	{
		String[] parts = key.split("\\.");
		if (parts.length == 1)
		{
			// Définition d'un nouveau composant
			Object component = Class.forName(value).newInstance();
			composants.put(parts[0], component);
		} else
		{
			// Injection d'une dépendance
			Object component = composants.get(parts[0]);
			Object reference = composants.get(value);
			PropertyUtils.setProperty(component, parts[1], reference);
		}
	}

}
