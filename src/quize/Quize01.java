package quize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Quize01 {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		String name, age, addr ;
		
		File path = new File("D:/���Ͽ��������_cny/06.13 ����/abcd1234/test.txt");
			
		System.out.println("�̸� �Է�");
		name = input.next();
		System.out.println("���� �Է�");
		age = input.next();
		System.out.println("�ּ� �Է�");
		addr = input.next();
		
		FileOutputStream fos = new FileOutputStream(path);
		
		fos.write(name.getBytes());
		fos.write(age.getBytes());
		fos.write(addr.getBytes());
		
	}
}
