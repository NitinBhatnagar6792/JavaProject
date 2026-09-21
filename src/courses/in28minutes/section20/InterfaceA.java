package courses.in28minutes.section20;

public interface InterfaceA {
	
	public int SIZE  = 10;
	
	default void printSize() {
		System.out.println("**InterfaceA.SIZE="+SIZE);
	}

}
