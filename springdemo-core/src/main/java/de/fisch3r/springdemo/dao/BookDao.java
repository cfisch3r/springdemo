package de.fisch3r.springdemo.dao;

import java.util.List;

import de.fisch3r.springdemo.entity.Book;

/**
 * DAO for books.
 *
 */
public interface BookDao {
	List<Book> all();

	void add(Book book);

	PagedResult<Book> getPagesList(int pageNumber, int pageSize);
}
