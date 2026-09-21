package courses.in28minutes;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

class Student {
	
	String name;
	int [] marks;

	public static Student of(String name, int... marks) {
		return new Student(name, marks);
	}
	
	public Student(String name, int [] marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public int getNumberOfMarks() {
		return (marks != null) ? marks.length : 0;
	}

	public int getTotalSumOfMarks() {
		if (marks  == null) return 0;
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		if (marks  == null) return 0;
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) max = mark; 
		}
		return max;
	}

	public int getMimimumMark() {
		if (marks  == null) return 0;
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) min = mark; 
		}
		return min;
	}

	public BigDecimal getAverageMarks() {
		if (marks  == null) return BigDecimal.ZERO;
		int num = getNumberOfMarks();
		int sum = getTotalSumOfMarks();
//        String avg = String.format("%06.2f", (1.0d*sum)/num);
//		System.out.println("avg="+avg);
//        return new BigDecimal(avg);
//		return BigDecimal.valueOf(sum).divide(BigDecimal.valueOf(num), 2, BigDecimal.ROUND_UP);
		return BigDecimal.valueOf(sum)
        .divide(BigDecimal.valueOf(num), 2, java.math.RoundingMode.UP);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + Objects.hash(name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Arrays.equals(marks, other.marks) && Objects.equals(name, other.name);
	}
}

public class TestArrays {

	public static void main(String[] args) {
		// int []  marks = new int[] {97, 98, 100};
		// Student student = new Student("John", marks) ;
		Student student = Student.of("John", 40,50,80) ;
		System.out.println("number of marks="+student.getNumberOfMarks());
		System.out.println("total marks="+student.getTotalSumOfMarks());
		System.out.println("max marks="+student.getMaximumMark());
		System.out.println("min marks="+student.getMimimumMark());
		System.out.println("average="+student.getAverageMarks());
	}

}
