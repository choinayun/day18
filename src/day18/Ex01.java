package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// ���� �����
// ��ũ�� �����ϴ� ��� 
// ���������� �ϱ����� ���

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/���Ͽ��������_cny/eclipse-jee-2022-03-R-win32-x86_64/aaa.txt");
		// ��ȣ �ȿ� ���� ��ġ ��� 
		// �������� �ΰ� - ������ �ϳ��� �����ϰ� ���� ���� 
	
		FileOutputStream os = new FileOutputStream(path);
		// stream : ������� 
		// FileOutputStream : ���� �⺻�� �Ǵ� stream 
		// add throws �������ְ� FileNotFound ���� Exception �� ���ܵΰ� ���� 
		
		os.write('A');
		os.write(97);
			
		String s = "hello";
		os.write( s.getBytes() );
		// getBytes : ����ϴ� ���ڿ��� ����Ʈ�������� ��ȯ 
	}
}






