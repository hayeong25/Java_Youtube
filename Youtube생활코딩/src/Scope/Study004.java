package Scope;

// 생활코딩 자바 82강

// this

class C {
	int v = 10; // 전역변수 v
	
	void m() {
		int v = 20; // 지역변수 v
		System.out.println(v);
		System.out.println(this.v);
	}
}

public class Study004 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.m();
	}
}