package UserDefinedFunction;

	// 사용자 정의 함수는 사용자가 쉽게 생성 가능. 함수 = 메소드

public class Test001 {
	
	// 3개의 수 최대 공약수를 찾는 프로그램 작성
	
	public static int function(int a, int b, int c) { // a, b, c,는 매개변수
			  // 반환형	함수명	매개변수
		
		int min; // 최대공약수
		
		if(a > b) {
			if(b > c) {
				min = c;
			}
			else {
				min = b;
			}
		}
		else {
			if(a > c) {
				min = c;
			}
			else {
				min = a;
			}
		}
		
		for(int i = min; i > 0; i--) {
			if((a % i == 0) && (b % i == 0) && (c % i == 0)) {
				return i;
			}
		}
		return -1; // 에러 발생 시 반환값
	}
	
	public static void main(String[] args) {

		System.out.println("(400, 350, 750)의 최대 공약수 : " + function(400, 350, 750));

	}
}