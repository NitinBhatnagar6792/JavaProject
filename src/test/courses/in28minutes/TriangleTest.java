package test.courses.in28minutes;

import java.util.TreeSet;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testRightTriangle(5,4,3);
	}

	private static void testRightTriangle(int i, int j, int k) {
		// TODO Auto-generated method stub
		if (i <= 0 || j <= 0 || k <= 0)  {
			System.out.println("Invalid input");
			return;
		}
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(i);
		ts.add(j);
		ts.add(k);
		var itr = ts.iterator();
		int s1 = itr.next();
		int s2 = itr.next();
		int ls = itr.next();
		
		if (ls*ls == s1*s1 + s2*s2) {
			System.out.println("Is right triangle");
		} else {
			System.out.println("Is not right triangle");
		}
		
	}

}
