package Scope;

// 생활코딩 자바 81강

public class Study002 {
	static void a() {
		String title = "coding everybody";
		System.out.println(title);
	}
	
	public static void main(String[] args) {
		a();
//		System.out.println(title);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
	}
}
