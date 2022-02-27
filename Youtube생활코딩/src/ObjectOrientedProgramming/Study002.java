package ObjectOrientedProgramming;

// 생활코딩 객체 지향 프로그래밍 3강

public class Study002 {

	public static void main(String[] args) {
	
		printA("====");
		printA("====");
		printB("====");
		printB("====");
		
		printA("****");
		printA("****");
		printB("****");
		printB("****");
		
	}
	
	public static void printA(String delimiter) {

		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	
	}
	
	public static void printB(String delimiter) {

		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	
	}
}