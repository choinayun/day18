package day18;

import java.io.*;

public class Ex05 {
	
	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/���Ͽ��������_cny/06.13 ����/aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		// ���������� ���� ó�����ִ� stream
		
		// dos.write(); ���� �� �پ��� �������� ����� ���� (����ȯ �ʿ����)
		String s = "�ȳ��ϼ���";
		dos.writeUTF(s);

		// stream �� �����ؼ� �����ָ� �������� �ݾ���� ȿ�������� ��� ���� 
		// ������ ������ �ݴ�� �������� �ݾ��ָ� �ȴ�
		dos.close(); 
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String str = dis.readUTF();
		System.out.println("������ ����  : " + str);
		
		dis.close();
		bis.close();
		fis.close();
	
	}

}
