package ObjectOrientedProgramming;

// 생활코딩 객체 지향 프로그래밍 7강

// static

class Static {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); >> Error. instance 호출 불가능
	}
	
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class Study005 {
	public static void main(String[] args) {
		System.out.println(Static.classVar);
//		System.out.println(Static.instanceVar); >> Error. instance 직접 접근 불가능
		Static.classMethod();
//		Static.instanceMethod(); >> Error. instanceMethod는 instance 소속이기 때문에 class를 통한 접근은 불가능
		
		Static s1 = new Static();
		Static s2 = new Static();
		
//		System.out.println(s1.classVar); // I class var
		System.out.println(s1.instanceVar); // I instance var
		
//		s1.classVar = "changed by s1";
		System.out.println(Static.classVar); // changed by s1
//		System.out.println(s2.classVar); // changed by s1
		
		s1.instanceVar = "changed by s1";
		System.out.println(s1.instanceVar); // changed by s1
		System.out.println(s2.instanceVar); // I instance var
		
		// static으로 선언된 클래스의 변수 값이 변경되면, 그 클래스를 인스턴스화 한 객체의 값도 변경된다
		// 그 객체 값이 변하면 static 클래스의 변수 값도 변경됨
	}
}