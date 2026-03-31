package test.courses.in28minutes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyNumber {

	private int number;
	Set<Integer> factors = new TreeSet<>();
	
	public MyNumber(int number) {
		this.number = number;
		compute();
	}
	
	public boolean isPrime() {
		return factors.isEmpty();
	}
	
	public long sumUptoN() {
		return (number * (number+1))/2;
	}
	
	public long sumOfDivisers() {
		//return factors.stream().mapToInt(Integer::intValue).sum();
		Iterator<Integer> itr = factors.iterator();
		int sum = 0;
		while(itr.hasNext()) {
			sum += itr.next().intValue();
		}
		return sum;
	}
	
	public void printNumberTriangle() {
		
		String curLine = "";
		for (int i= 1 ; i< number; i++) {
			curLine = (i == 1) ? String.format("%d", i): String.format("%s %d", curLine, i);
			System.out.println(curLine);
		}
	}
	
	private final void compute() {
		System.out.println("number="+number);
		if (number <= 2) return; 
		int minFactorCandidate = 2;
		int maxFactorCandidate = number /2;
		for (int factor = minFactorCandidate; factor< maxFactorCandidate; factor++) {
			if (number % factor == 0) {
				factors.add(factor);
				maxFactorCandidate = number / factor;
				factors.add(maxFactorCandidate);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber myNumber = new MyNumber(6);
		System.out.println("isPrime="+myNumber.isPrime());
		System.out.println("sumUptoN="+myNumber.sumUptoN());
		System.out.println("sumOfDivisers="+myNumber.sumOfDivisers());
		myNumber.printNumberTriangle();
	}

}
