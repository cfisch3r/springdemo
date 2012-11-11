package de.fisch3r.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.ScrollableResults;

import de.fisch3r.springdemo.dao.PagedResult;
import de.fisch3r.springdemo.dao.ResultPager;

/**
 * Resultpager implementation using ScrollableResults.
 *
 */
public class ResultPagerImpl implements ResultPager {

	@Override
	public final <T> PagedResult<T> getResult(Criteria criteria, Class<T> clazz,
			int pageNumber, int pageSize) {
		ScrollableResults result = criteria.scroll();
		result.last();
		int totalCount = result.getRowNumber() + 1;

		// TODO check parameters

		@SuppressWarnings("unchecked")
		List<T> entries = (List<T>) criteria
				.setFirstResult(pageNumber * pageSize).setMaxResults(pageSize)
				.list();
		PagedResult<T> pagedResult = new PagedResult<T>(pageNumber, pageSize,
				entries, totalCount);
		return pagedResult;
	}

}
