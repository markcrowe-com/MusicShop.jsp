package support;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DatabaseAgent
{
	protected DatabaseAgent(String persistenceUnitName)
	{
		_entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
	}
	/**
	 * gets the EntityManagerFactory for the persistenceUnit
	 *
	 * @return the EntityManagerFactory for the persistenceUnit
	 */
	public EntityManagerFactory getEntityManagerFactory()
	{
		return _entityManagerFactory;
	}
	//
	//	Private Fields
	//
	private final EntityManagerFactory _entityManagerFactory;
}
