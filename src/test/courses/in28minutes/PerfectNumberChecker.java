package test.courses.in28minutes;

import java.util.Set;
import java.util.TreeSet;

public class PerfectNumberChecker {
    
	public boolean isPerfectNumber(int number) {
        
        if (number % 2 == 1) return false;
        int sumOfFactors = 1;
        int startFactorCandidate = 2;
        int endFactorCandidate = number / 2;
        Set<Integer> factorsSet = new TreeSet<>();
        factorsSet.add(1);
        for (int factor = startFactorCandidate; factor < endFactorCandidate;factor++) {
            if(number % factor == 0) {
                sumOfFactors+= factor;
                factorsSet.add(factor);
                endFactorCandidate = number / factor;
                sumOfFactors+= endFactorCandidate;
                factorsSet.add(endFactorCandidate);
            }
        }
        if (sumOfFactors == number) {
        	System.out.println(number +"="+factorsSet);
        }
        return sumOfFactors == number ? true : false;
    }
    
    public static void main(String[] args) {
    	PerfectNumberChecker pnc = new PerfectNumberChecker();
    	System.out.println("6 is "+ pnc.isPerfectNumber(6));
    	System.out.println("28 is "+ pnc.isPerfectNumber(28));
    	System.out.println("496 is "+ pnc.isPerfectNumber(496));
    	for (int i=2; i< 10000; i++) {
    		if(pnc.isPerfectNumber(i)) {
    			System.out.println("perfect number found:"+i);
    		}
    	}
	}
}