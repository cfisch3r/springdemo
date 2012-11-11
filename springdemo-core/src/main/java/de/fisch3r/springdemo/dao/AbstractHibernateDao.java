package de.fisch3r.springdemo.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.util.Assert;

/**
 * Abstract DAO for Hibernate entities.
 *
 * @param <T>
 */
public abstract class AbstractHibernateDao<T> {
	private final Class<T> entityClass;
	private final SessionFactory sessionFactory;

	public AbstractHibernateDao(Class<T> entityClass,
			SessionFactory sessionFactory) {

		Assert.notNull(entityClass, "entityClass must not be null");
		Assert.notNull(sessionFactory, "sessionFactory must not be null");

		this.entityClass = entityClass;
		this.sessionFactory = sessionFactory;
	}

	protected final Criteria criteria() {
		return currentSession().createCriteria(entityClass);
	}

	protected final Query query(String hql) {
		return currentSession().createQuery(hql);
	}

	protected final Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	protected final List<T> list() {
		return (List<T>) criteria().list();
	}

	@SuppressWarnings("unchecked")
	protected final T get(Serializable id) {
		return (T) currentSession().get(entityClass, id);
	}

}
