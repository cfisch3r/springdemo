package de.fisch3r.springdemo.dao;

import java.util.List;

/**
 * Paged result set for DAO methods.
 *
 * @param <T>
 */
public final class PagedResult<T> {

	private int pageNumber;

	public PagedResult(int pageNumber, int pageSize, List<T> entries,
			int totalCount) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.entries = entries;
		this.totalCount = totalCount;
	}

	private int pageSize;

	private List<T> entries;

	private int totalCount;

	public int getTotalCount() {
		return totalCount;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public int getPageCount() {
		if (pageSize > 0) {
			return totalCount / pageSize;
		} else {
			return 0;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public List<T> getEntries() {
		return entries;
	}
}
