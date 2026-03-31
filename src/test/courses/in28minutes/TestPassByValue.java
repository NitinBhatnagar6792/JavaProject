package test.courses.in28minutes;

import java.util.Objects;

interface IBase {
	
}

abstract class IClass {
	
}

class IntClass extends IClass implements IBase {
	
	{
		System.out.println("***instance initialization block");
		i = 100;
	}

	static {
		System.out.println("***static initialization block");
	}

	public int i ;

	public IntClass() {
		System.out.println("***constructor called");
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntClass other = (IntClass) obj;
		return i == other.i;
	}
	
}

public class TestPassByValue {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("before x="+x);
		increment(x);
		System.out.println("after x="+x);

		Integer y = Integer.valueOf(10);
		System.out.println("before y="+y);
		increment(y);
		System.out.println("after y="+y);
	
		IntClass z = new IntClass();
		//z.i = 10;
		System.out.println("z.i="+z.i);
		System.out.println("before z"+z);
		increment(z);
		System.out.println("after z"+z);
		
		
	}

	private static void increment(int x) {
		x+=20;
	}
	
	private static void increment(Integer y) {
		y+=20;
	}

	private static void increment(IntClass z) {
		int old = z.i;
		z = new IntClass();
		z.i = old + 20;
		System.out.println("z="+z);
	}
	
}
