package Generic;

// 생활코딩 자바 150강

interface Info {
	int getLevel();
}

class EmployeeInfo3 implements Info {
	public int rank;
	EmployeeInfo3(int rank) {
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class Person4<T extends Info> {
	public T info;
	public Person4(T info) {
		this.info = info;
		info.getLevel();
	}
}

public class Study004 {
	public static void main(String[] args) {
		Person4<EmployeeInfo3> p4 = new Person4<EmployeeInfo3>(new EmployeeInfo3(1));
//		Person4<String> p5 = new Person4<String>("부장");
		System.out.println(p4.info.rank);
	}
}