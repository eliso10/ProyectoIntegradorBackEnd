package com.bookstore.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book {
	//Attributes
	//Ids de tipo dato Long
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id", unique=true, nullable=false)
	private Long book_id;
	
	@Column(nullable=false)
	
	private String title;
	@Column(nullable=false)
	
	private String isbn;
	@Column(nullable=false)
	
	private String publish_date;
	@Column(nullable=false)
	private int stock;
	
	//Constructor vacio para JPA
	public Book() {	
	}
	
	@ManyToOne
	@JoinColumn(name ="Genre_genre_id", nullable=false)
	private Genre genre;
	
	//relaciones M:N
	@ManyToMany
	@JoinTable(
			name="Book_has_Author",
			joinColumns = @JoinColumn(name="Book_book_id"),
			inverseJoinColumns = @JoinColumn(name="Author_author_id")
			
			)
	private List<Author> authors;
	
	//Getters setters
	public Long getBook_id() {
		return book_id;
	}
	public void setBook_id(Long book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//to string
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", isbn=" + isbn + ", publish_date=" + publish_date
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
}