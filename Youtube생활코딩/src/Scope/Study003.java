package Scope;

// 생활코딩 자바 81강

public class Study003 {

	static int i = 5;
	
	static void a() { // 동적인 유효범위(Dynamic Scope)
		int i = 10;
		System.out.println(i);
		b();
	}
	
	static void b() { // 정적인 유효범위(Static Scope)
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		a();
	}
}