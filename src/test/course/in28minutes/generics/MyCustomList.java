package test.course.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class MyCustomList <T> {

	List<T> list = new ArrayList<>();
	
	public boolean addElement (T t) {
		return list.add(t);
	}

	public boolean removeElement (T t) {
		return list.remove(t);
	}
	
	public T get(int index) {
		return list.get(index);
	}	

	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}
	
	// generic method example
	public static <X extends Number> X doSomeThing (X x) {
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCustomList<String> strList = new MyCustomList<>();
		strList.addElement("Hello");
		strList.addElement("World");
		strList.removeElement("Hello");
		System.out.println("strList="+strList);
		System.out.println("Str Item at 0 position is:"+strList.get(0));
		
		MyCustomList<Integer> intList = new MyCustomList<>();
		intList.addElement(Integer.valueOf(10));
		intList.addElement(Integer.valueOf(20));
		intList.removeElement(Integer.valueOf(10));
		System.out.println("intList="+intList);
		System.out.println("Int Item at 0 position is:"+intList.get(0));
		
		
	}


}
