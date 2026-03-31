package test.courses.in28minutes.section20;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private int id;
	private String name;
	private String author;
	private List<Review> reviews = new ArrayList<>();
	
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Review> getReviews() {
		return reviews;
	}
	
	public boolean addReview(Review review) {
		return this.reviews.add(review);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}
	
	
}
