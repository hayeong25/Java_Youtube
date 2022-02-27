package Generic;

// 생활코딩 자바 146강 

// 제네릭(Generic) : 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법

class Person1<T> {
	public T info; // T는 info 필드의 데이터 타입
}

public class Study001 {
	public static void main(String[] args) {
		Person1<String> p1 = new Person1<String>(); // info가 String이 된다
//		Person<StringBuilder> p2 = new Person<StringBuilder>(); // info가 StringBuilder가 된다
		p1.info = "String";
	}
}