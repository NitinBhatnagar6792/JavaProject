package courses.in28minutes;

//sealed interface CustomerMessage permits Message, Feedback {};
interface CustomerMessage {};
final record Message(String text) implements CustomerMessage {};
final record Feedback(double rate, String description) implements CustomerMessage {};

public class TestSwitchWithRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerMessage cm = new Message("Hello world");
		
		String result  = switch(cm) {
		case Message(var text) -> "Processing :"+ text;
		case Feedback(var rate, var description) -> "Processing feedback: rate=%d, desc=%s".formatted(rate, description);
		default -> "invalid";
		};
		
		System.out.println("result:"+result);
	}

}
