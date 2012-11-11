package de.fisch3r.springdemo.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import de.fisch3r.springdemo.dao.AbstractHibernateDao;
import de.fisch3r.springdemo.dao.BookDao;
import de.fisch3r.springdemo.dao.PagedResult;
import de.fisch3r.springdemo.dao.ResultPager;
import de.fisch3r.springdemo.entity.Book;

/**
 * BookDao implementation.
 *
 */
@Repository
@Transactional(readOnly = true)
public final class BookDaoImpl extends AbstractHibernateDao<Book> implements
		BookDao {

	@Autowired
	private ResultPager resultPager;

	@Autowired
	public BookDaoImpl(SessionFactory sessionFactory) {
		super(Book.class, sessionFactory);
	}

	@Override
	public List<Book> all() {
		return super.list();
	}

	@Transactional(readOnly = false)
	public void add(Book book) {
		currentSession().save(book);
	}

	@Transactional
	public PagedResult<Book> getPagesList(int pageNumber, int pageSize) {
		PagedResult<Book> pagedResult = resultPager.getResult(criteria(),
				Book.class, pageNumber, pageSize);
		return pagedResult;
	}

}
