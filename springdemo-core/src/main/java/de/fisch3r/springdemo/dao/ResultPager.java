package de.fisch3r.springdemo.dao;

import org.hibernate.Criteria;

/**
 * Returns a paged result for hibernate query.
 *
 */
public interface ResultPager {

	<T> PagedResult<T> getResult(Criteria criteria, Class<T> clazz, int pageNumber, int pageSize);
}
