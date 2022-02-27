package Collection;

// 생활코딩 자바 151강

// Collections Framework - ArrayList

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three"; >> 배열 범위 벗어나 오류 발생
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		for (int i = 0; i < al.size(); i++) {
			String value = al.get(i);
			System.out.println(value);
		}
	}
}