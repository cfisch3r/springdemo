package de.fisch3r.springdemo.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import de.fisch3r.springdemo.entity.Book;

/**
 * Integration Test.
 *
 */
@ContextConfiguration(locations = "classpath:/services.xml")
@Transactional
@TransactionConfiguration(transactionManager = "txManager")
@TestExecutionListeners(TransactionalTestExecutionListener.class)
public final class BookDaoIT extends AbstractTestNGSpringContextTests {

	private static final int TOTAL_BOOKS_COUNT = 10;

	@Autowired
	private BookDao underTest;

	@Test
	public void allReturnsAllBooks() {
		final List<Book> books = underTest.all();

		assertTrue(!books.isEmpty(), "no books were found.");
	}

	@Test(expectedExceptions = ConstraintViolationException.class)
	public void addBookWithEmptyTitleThrowsException() {
		underTest.add(new Book());
	}

	@Test
	public void addBookCreatesNewId() {
		Book book = new Book("integration test");
		underTest.add(book);
		assertNotNull(book.getId(), "No id was assigned to new book.");
	}

	@Test
	public void getListForFirstPageReturnsPartialBookList() {
		final int pageSize = 5;
		PagedResult<Book> pagedResult = underTest.getPagesList(0, pageSize);
		assertEquals(pagedResult.getEntries().size(), pageSize,
				"Page has wrong size.");
		assertEquals(pagedResult.getTotalCount(), TOTAL_BOOKS_COUNT);
		assertEquals(pagedResult.getPageNumber(), 0);
	}

	@Test
	public void getListForNotExistingPageReturnsEmptyBookList() {
		final int pageSize = 5;
		final int pageIndex = 100;
		PagedResult<Book> pagedResult = underTest.getPagesList(pageIndex, pageSize);
		assertEquals(pagedResult.getEntries().size(), 0, "Page has wrong size.");
	}
}
