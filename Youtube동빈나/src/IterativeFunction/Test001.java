package IterativeFunction;

// 팩토리얼

public class Test001 {

	public static int factorial(int number) {
	
		int sum = 1;
		
		for(int i = 2; i <= number; i++) {
			sum *= i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("10 팩토리얼은 " + factorial(10) + "입니다.");
		
	}
	
}
