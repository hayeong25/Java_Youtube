package ObjectOrientedProgramming;

// 생활코딩 객체 지향 프로그래밍 6강

class Print2 {
	public String delimiter = "";
		public void A() {
			System.out.println(delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		
		public void B() {
			System.out.println(delimiter);
			System.out.println("B");
			System.out.println("B");
		}
}

public class Study004 {
	public static void main(String[] args) {
		Print2 p1 = new Print2();
		p1.delimiter = "====";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print2 p2 = new Print2();
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();	
	}	
}