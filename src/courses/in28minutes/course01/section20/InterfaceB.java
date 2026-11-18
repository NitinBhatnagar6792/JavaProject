package courses.in28minutes.course01.section20;

public interface InterfaceB {
	
	public int SIZE  = 20;

	default void printSize() {
		System.out.println("**InterfaceB.SIZE="+SIZE);
	}
	
}
