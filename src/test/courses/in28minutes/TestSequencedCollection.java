package test.courses.in28minutes;

import java.util.ArrayList;
import java.util.List;

public class TestSequencedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("B");
		list.addFirst("A");
		list.add("C");
		list.addLast("D");
		
		System.out.println(list);
		System.out.println("first="+list.getFirst());
		System.out.println("last="+list.getLast());

		list.removeFirst();
		list.removeLast();
		System.out.println("list after removing 1st and last element:"+list);
		list.reversed();
		System.out.println("reversed list"+list);
	
	}

}
