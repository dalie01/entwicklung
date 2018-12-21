package dmc.tax;

import java.math.BigDecimal;

/**
 * Amount is include Tax.
 * calculate vat from Amount 
 * */
public class Main {
	
	public static void main(String[] args) {
		
		BigDecimal taxRate = new BigDecimal(0.08);
		BigDecimal amount = new BigDecimal(1000.00);
		System.out.println("Tax as a % : " + taxRate.multiply(new BigDecimal(100.00)));
		System.out.println("Amount: " + amount);
		System.out.println("Tax is: " + taxRate.multiply(amount));
		System.out.println("Amount with Tax (brutto) : " + amount.add(taxRate.multiply(amount)));
		
		BigDecimal taxValue = taxRate.add(new BigDecimal(1.00));
		BigDecimal priceTaxValue = amount.divide(taxValue,2,BigDecimal.ROUND_HALF_EVEN);
		
		System.out.println("\nAmount: " + amount);
		System.out.println("Tax is : " + amount.subtract(priceTaxValue));
		System.out.println("Amount without Tax (netto) : " + priceTaxValue);
		
	}
	
}
