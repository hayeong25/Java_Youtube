package ObjectOrientedProgramming;

// 생활코딩 객체 지향 프로그래밍 9강

class Accounting {
	public double valueOfSupply; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율
	
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}

public class Test001 {	
	public static void main(String[] args) {
//		Accounting.valueOfSupply = 10000.0; // 공급가액
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		System.out.println("VAT : " + Accounting.getVAT());
//		System.out.println("Total : " + Accounting.getTotal());
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
	}
}