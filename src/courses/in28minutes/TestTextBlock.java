package courses.in28minutes;

public class TestTextBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textBlock = """
				Hello
					World
				 Good
				  Day	
				 Trailing Spaces are stripped off       
				     common leading spaces between all the lines are removed 
				Bye
				""";
		System.out.print(textBlock);
		System.out.println("******************************");
		String textBlock2 = """
				Line1
				Line2
				Here leading space are removed as they are same for each line
				""";
		System.out.print(textBlock2);

		//String notvalid = """ Not valid """;;
	}

}
