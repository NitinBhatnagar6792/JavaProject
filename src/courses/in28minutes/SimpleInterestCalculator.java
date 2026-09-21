package courses.in28minutes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private String principal;
	private String rateOfInterest;
	
	public SimpleInterestCalculator(String principal, String rateOfInterest) {
		this.principal =principal;
		this.rateOfInterest = rateOfInterest;
	}
	
	public BigDecimal calculateTotalValue(int numberOfYears) {
		// p(1+r*n/100)
		BigDecimal p = new BigDecimal(this.principal);
		BigDecimal r = new BigDecimal(rateOfInterest);
		BigDecimal n = new BigDecimal(numberOfYears);
		BigDecimal l = r.multiply(n).divide(new BigDecimal(100));
		BigDecimal totalValue = p.multiply(BigDecimal.ONE.add(l));
		return totalValue;
	}
	
	public static void main(String[] args) {
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);
	}
}
