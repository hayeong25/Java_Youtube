package Constructor;

// 생활코딩 자바 83강

// 초기화와 생성자

class Calculator {
	int left, right;
	
	public Calculator(int left, int right) { // 생성자 이름은 클래스 이름과 동일해야 한다
		// 초기화 작업
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class Study001 {
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}
}