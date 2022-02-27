package Generic;

// 생활코딩 자바 148~149강

class EmployeeInfo2 {
	public int rank;
	public EmployeeInfo2(int rank) {
		this.rank = rank;
	}
}

class Person3<T, S> {
	public T info;
	public S id;
	public Person3(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class Study003 {
	public static void main(String[] args) {
		Person3<EmployeeInfo2, Integer> p1 = new Person3<EmployeeInfo2, Integer>(new EmployeeInfo2(1), 1);
		System.out.println(p1.id.intValue());
		p1.printInfo(new EmployeeInfo2(1));
	}
}