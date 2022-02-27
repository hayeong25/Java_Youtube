package ObjectOrientedProgramming;

import java.io.FileWriter;
import java.io.IOException;

// 생활코딩 객체 지향 프로그래밍 2강

public class Study001 {

	public static void main(String[] args) throws IOException {

		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("JAVA");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write("JAVA2");
		f2.close();
		
		// 여기서 class는 System, Math, FileWriter
		// 여기서 instance는 f1, f2
	}
}