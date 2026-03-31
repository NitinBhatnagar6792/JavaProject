package test.courses.in28minutes.section20;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(123, "Object Oriented programming", "Author1");
		book.addReview(new Review(10, "good book", 5));
		book.addReview(new Review(101, "great book", 9));
		System.out.println(book);
	}

}
