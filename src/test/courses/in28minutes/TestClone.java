package test.courses.in28minutes;

import java.util.ArrayList;
import java.util.List;

class CloneA {
	private String name;
	private int age;
	public CloneA() {
		
	}

	public CloneA(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "CloneA [name=" + name + ", age=" + age + "]";
	}
	
	

}

class ShallowClone extends CloneA implements Cloneable {

	private String grade;
	List<Integer> marks  = new ArrayList<>();

	public ShallowClone() {
		super();
	}
	
	public ShallowClone(String grade) {
		super();
		this.grade = grade;
	}
	
	public ShallowClone(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void addMarks(Integer mark) {
		marks.add(mark);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "ShallowClone [grade=" + grade + ", marks=" + marks + ", toString()=" + super.toString() + "]";
	}
	
}


class DeepClone extends CloneA implements Cloneable {

	private String grade;
	List<Integer> marks  = new ArrayList<>();

	public DeepClone() {
		super();
	}
	
	public DeepClone(String grade) {
		super();
		this.grade = grade;
	}
	
	public DeepClone(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	public void addMarks(Integer mark) {
		marks.add(mark);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepClone theClone = (DeepClone)super.clone();
		theClone.marks = new ArrayList<>(theClone.marks);
		return theClone;
	}

	@Override
	public String toString() {
		return "DeepClone [grade=" + grade + ", marks=" + marks + ", toString()=" + super.toString() + "]";
	}
	
}

public class TestClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		testShallowClone();
		testDeepClone();
	}
	public static void testShallowClone() throws CloneNotSupportedException {
		System.out.println("*** testDeepClone ***");
		ShallowClone b = new ShallowClone("jack", 20, "manager");
		b.addMarks(99);
		b.addMarks(95);
		System.out.println("b="+b);
		ShallowClone b1 = (ShallowClone)b.clone();
		System.out.println("b1="+b1);
		b1.addMarks(80);
		System.out.println("*** after updating marks for b1 ***");
		System.out.println("b="+b);
		System.out.println("b1="+b1);
	}

	public static void testDeepClone() throws CloneNotSupportedException {
		
		System.out.println("*** testDeepClone ***");
		DeepClone b = new DeepClone("jack", 20, "manager");
		b.addMarks(99);
		b.addMarks(95);
		System.out.println("b="+b);
		DeepClone b1 = (DeepClone)b.clone();
		System.out.println("b1="+b1);
		b1.addMarks(80);
		System.out.println("*** after updating marks for b1 ***");
		System.out.println("b="+b);
		System.out.println("b1="+b1);
	}
	
}
