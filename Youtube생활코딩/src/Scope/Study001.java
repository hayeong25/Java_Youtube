package Scope;

// 생활코딩 자바 79강, 80강

// 유효범위(Scope)

public class Study001 {
	
	static int i; // 전역변수 i
	
	static void a() {
		i = 0; // 변수 i는 a 메소드 안에서만 유효
	}
	
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
}