package Collection;

// 생활코딩 자바 159강

// 정렬(Sort)

// compareTo

import java.util.*;

class Computer implements Comparable<Object> {
	int serial;
	String owner;
	Computer(int serial, String owner) {
		this.serial = serial;
		this.owner = owner;
	}
	
	@Override
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	
	public String toString() {
		return serial + " " + owner;
	}
}

public class list {
	public static void main(String[] args) {
		
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500, "egoing"));
		computers.add(new Computer(200, "leezche"));
		computers.add(new Computer(3233, "graphittie"));
		
		Iterator<Computer> i = computers.iterator();
		
		System.out.println("before");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Collections.sort(computers);
		
		System.out.println("\nafter");
		
		i = computers.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}