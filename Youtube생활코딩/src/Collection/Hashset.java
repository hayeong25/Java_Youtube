package Collection;

import java.util.HashSet;
import java.util.Iterator;

// 생활코딩 자바 153~154강

// Collections Framework - HashSet

// Set은 수학에서의 '집합'과 같다. 중복 요소 허용 X

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); // false
		System.out.println(A.containsAll(C)); // true
		
		A.addAll(B); // addAll : 합집합
		A.retainAll(B); // retainAll : 교집합
		A.removeAll(B); // removeAll : 차집합
		
		Iterator<Integer> i = (Iterator<Integer>)A.iterator(); // Collection 인터페이스를 구현하고 있는 모든 클래스는 Iterator 메소드 사용 가능
		while(i.hasNext()) {
			System.out.println(i.next()); // 결과값은 1 2 3
			// ArrayList와 달리 HashSet은 이미 존재하는 값이 있으면 더이상 추가하지 않음
		}
	}
}