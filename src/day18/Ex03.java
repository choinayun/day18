package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/���Ͽ��������_cny/06.13 ����/aaa.txt");
		
		FileInputStream fis = new FileInputStream(path);
		// ������ ������ �ҷ����� stream 
		// ���� ���� �� ������ �߸� �ش��ϴ� ��ġ�� ������ �������� �ʴ� �� 
		
		while(true) {
			
			Thread.sleep(1000);
			
			int res = fis.read();
			
			// System.out.println("res : " + res);
			// ���������� �� �̻� ������ ������ ���� �� 
			// res ���� -1 �� �ȴ� ( -> eof ���̶�� �θ���)
			
			if(res < 0) 
				break;
			System.out.println((char)res);
			// int ���·� �������� ���ڷ� ��� ��� 
			// char �� ����ȯ�ؼ� ��������
		
		}
		
		
	}
}
