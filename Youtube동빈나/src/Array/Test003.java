package Array;

// 다차원 배열

// 50 * 50의 정수 랜덤 데이터 생성

public class Test003 {

	public static void main(String[] args) {
		
		int N = 50;
		
		int[][] array = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}	
}