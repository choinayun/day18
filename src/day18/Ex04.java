package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Ex03 ���� �ߴ� �۾���
// �ϳ��� �������� ������ �ϴ� ����̿��� ��ȿ���� 
// �� ������ �ذ��Ϸ��� ����stream ����ؾ� �Ѵ�

public class Ex04 {

	public static void main(String[] args) throws Exception {
	
		File path = new File("D:/���Ͽ��������_cny/06.13 ����/aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ����Stream : �ѹ��� �����͸� �����ϴ� stream 
		
		for(int i = '1'; i < '9'; i++) {
			// Thread.sleep(2000);
			bos.write(i); 
			// ����ҿ��� ������ �� ���� 
			// file �� ������ �����ؾ� 
		}
		bos.flush();
		// ����ҿ� �ִ� ���� ����ּ��� (file�� ���� ����)
	}
}
