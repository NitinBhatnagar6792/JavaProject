package courses.in28minutes.section20;

public class Review {
	
	private int id;
	private String description;
	private int rating;
	
	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + ", rating=" + rating + "]";
	}
	
}
