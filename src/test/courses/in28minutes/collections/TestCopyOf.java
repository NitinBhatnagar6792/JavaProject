package test.courses.in28minutes.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> modifiableList = new ArrayList<>();
		modifiableList.add("A");
		modifiableList.add("b");
		modifiableList.add("C");
		
		List<String> unModifiableList = List.copyOf(modifiableList);
		System.out.println("unModifiableList="+unModifiableList);
	}

}
