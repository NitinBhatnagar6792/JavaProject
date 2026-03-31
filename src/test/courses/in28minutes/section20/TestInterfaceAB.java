package test.courses.in28minutes.section20;

public class TestInterfaceAB implements InterfaceA, InterfaceB{

	public void test() {
		System.out.println("InterfaceA.SIZE="+InterfaceA.SIZE);
		System.out.println("InterfaceB.SIZE="+InterfaceB.SIZE);
	}
	
	public static void main(String[] args) {
		TestInterfaceAB testInterfaceAB  = new TestInterfaceAB();
		testInterfaceAB.test();
		testInterfaceAB.printSize();
	}
	
	public void printSize() {
        // Call InterfaceA default method
        InterfaceA.super.printSize();
        // Call InterfaceB default method
        InterfaceB.super.printSize();		
	}
}
