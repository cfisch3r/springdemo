package de.fisch3r.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Book Entity.
 */
@Entity
public final class Book {
	private Long id;

	private String title;

	public Book() {
		super();
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	@Column(nullable = false)
	@NotEmpty
	public String getTitle() {
		return title;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
