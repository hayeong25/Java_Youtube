package Generic;

// 생활코딩 자바 제네릭

class StudentInfo {
	public int grade;
	public StudentInfo(int grade) {
		this.grade = grade;
	}
}

class StudentPerson {
	public StudentInfo info;
	StudentPerson(StudentInfo info) {
		this.info = info;
	}
}

class EmployeeInfo {
	public int rank;
	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) {
		this.info = info;
	}
}

public class Study002 {
	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade);
		EmployeeInfo ei1 = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei1);
		System.out.println(ep.info.rank);
		
		Person2 p1 = new Person2("부장"); // 문법적으로 틀린 부분은 없지만, 타입이 안전하지 않다 >> 데이터 타입을 지정할 제네릭이 필요함
		EmployeeInfo ei2 = (EmployeeInfo)p1.info;
		System.out.println(ei2.rank);
	}
}

class Person2 {
	public Object info;
	public Person2(Object info) {
		this.info = info;
	}
}