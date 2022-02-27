package ObjectOrientedProgramming;

// 생활코딩 객체 지향 프로그래밍 4강

class Print {
	public static String delimiter = "";
		public static void A() {
			System.out.println(delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		
		public static void B() {
			System.out.println(delimiter);
			System.out.println("B");
			System.out.println("B");
		}
}

public class Study003 {
	public static void main(String[] args) {
		Print.delimiter = "====";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
	}
	public static String delimiter = "";
	
	public static void printA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}	
}