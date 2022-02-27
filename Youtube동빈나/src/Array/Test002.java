package Array;

// 100개의 랜덤 정수의 평균 구하기

public class Test002 {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		for(int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random() * 100 + 1);
			// Math.random()은 0 <= X < 1의 수 중 임의의 수
			// Math.random() * 100은 0 <= X < 100
			// Math.random() * 100+1은 1 <= X < 101
		}
		
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		
		System.out.println("100개의 랜덤 정수의 평균은 " + sum / 100 + "입니다.");
	}	
}