package quize01;

import java.io.*;
import java.util.Scanner;

public class Student implements Serializable {
	
	Scanner input = new Scanner(System.in);
	
	Student s = null;
	
	String path = "D:/���Ͽ��������_cny/06.13 ����/�л� ���/";
	
	private String name;
	private int stuNum, kor, eng, math; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public void register() throws Exception {
	
		while(true) {

			s = new Student();
			
			System.out.println("����� �й��� �Է��ϼ���");
			stuNum = input.nextInt();
			s.setStuNum(stuNum);
			File path02 = new File("D:/���Ͽ��������_cny/06.13 ����/�л� ���/" + stuNum + ".txt");
			
			if( path02.exists() ) {
				System.out.println("�����ϴ� �й� �Դϴ�.");
				
			}else {
				
				System.out.println("�̸� �Է�");
				name = input.next();
				System.out.println("�������� : ");
				kor = input.nextInt();
				System.out.println("�������� : ");
				eng = input.nextInt();
				System.out.println("�������� : ");
				math = input.nextInt();
				
				s.setName(name);
				s.setKor(kor);
				s.setEng(eng);
				s.setMath(math);
				
				FileOutputStream fos = new FileOutputStream(path02);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);
				
				oos.writeObject(s);
				
				oos.close(); bos.close(); fos.close();
				
				System.out.println("��� �Ǿ����ϴ�.");
				
			}
		}
	}
	
	public void modify() {
		
		System.out.println("������ �й� �Է�");
		stuNum = input.nextInt();
		
		File p = new File(path + stuNum + ".txt");
		

		
	}
	
	public void delete() {
		
		File list = new File(path);
		String[] li = list.list();
		
		for(int i = 0; i < li.length; i++) {
			System.out.println( li[i] );
		}
		System.out.println();
		System.out.println("������ �й� �Է�");
		stuNum = input.nextInt();
		File p = new File(path + stuNum + ".txt");
		p.delete(); 
		System.out.println("���� �Ǿ����ϴ�.");
	}
	
	public void search() throws Exception {
		
		File list = new File(path);
		String[] li = list.list();
		
		for(int i = 0; i < li.length; i++) {
			System.out.println( li[i] );
		}
			
		System.out.println();
		System.out.println("Ȯ���� �й� �Է�");
		stuNum = input.nextInt();
		
		File p = new File(path + stuNum + ".txt");
			
		FileInputStream fis = new FileInputStream(p);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
			
		s = (Student)ois.readObject();
		
		System.out.println("==================");
		System.out.println("�̸� : " + s.getName());
		System.out.println("���� ���� : " + s.getKor());
		System.out.println("���� ���� : " + s.getEng());
		System.out.println("���� ���� : " + s.getMath());
		System.out.println("==================");
		
	}
}
	
