package UserDefinedFunction;

public class Test003 {

	// 문자열에서 마지막 단어를 반환하는 함수 작성
	
	public static char function(String input) {
		
		return input.charAt(input.length() - 1);
		// charAt은 문자열에서 문자를 뽑아오는 함수
		// 0부터 시작하는 charAt의 문자열에서 가장 마지막 문자를 가져오기 때문에 -1
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World의 마지막 단어는 " + function("Hello World") + "입니다.");
		
	}	
}