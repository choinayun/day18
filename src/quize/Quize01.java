package quize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		String name, age, addr ;
		
		File path = new File("D:/평일오후취업반_cny/06.13 수업/abcd1234/test.txt");
			
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.next();
		System.out.println("주소 입력");
		addr = input.next();
		
		FileOutputStream fos = new FileOutputStream(path);
		
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		
	}
}
