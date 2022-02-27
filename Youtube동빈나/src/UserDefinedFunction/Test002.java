package UserDefinedFunction;

public class Test002 {

	// 약수 중 K번째로 작은 수를 찾는 프로그램 작성
	
	public static int function(int number, int k) {
		
		for(int i = 1; i <= number; i++) {
			if(number % i == 0) {
				k--;
				if(k == 0) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) { // void는 반환형이 없다는 것을 의미함
		
		int result = function(3050, 10);
		if(result == -1) {
			System.out.println("3050의 10번째 약수는 없습니다.");
		}
		else {
			System.out.println("3050의 10번째 약수는 " + result + "입니다.");
		}
		
	}
}