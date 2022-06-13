package quize01;

import java.io.*;
import java.util.Scanner;

public class Student implements Serializable {
	
	Scanner input = new Scanner(System.in);
	
	Student s = null;
	
	String path = "D:/평일오후취업반_cny/06.13 수업/학생 목록/";
	
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
			
			System.out.println("등록할 학번을 입력하세요");
			stuNum = input.nextInt();
			s.setStuNum(stuNum);
			File path02 = new File("D:/평일오후취업반_cny/06.13 수업/학생 목록/" + stuNum + ".txt");
			
			if( path02.exists() ) {
				System.out.println("존재하는 학번 입니다.");
				
			}else {
				
				System.out.println("이름 입력");
				name = input.next();
				System.out.println("국어점수 : ");
				kor = input.nextInt();
				System.out.println("영어점수 : ");
				eng = input.nextInt();
				System.out.println("수학점수 : ");
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
				
				System.out.println("등록 되었습니다.");
				
			}
		}
	}
	
	public void modify() {
		
		System.out.println("수정할 학번 입력");
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
		System.out.println("삭제할 학번 입력");
		stuNum = input.nextInt();
		File p = new File(path + stuNum + ".txt");
		p.delete(); 
		System.out.println("삭제 되었습니다.");
	}
	
	public void search() throws Exception {
		
		File list = new File(path);
		String[] li = list.list();
		
		for(int i = 0; i < li.length; i++) {
			System.out.println( li[i] );
		}
			
		System.out.println();
		System.out.println("확인할 학번 입력");
		stuNum = input.nextInt();
		
		File p = new File(path + stuNum + ".txt");
			
		FileInputStream fis = new FileInputStream(p);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
			
		s = (Student)ois.readObject();
		
		System.out.println("==================");
		System.out.println("이름 : " + s.getName());
		System.out.println("국어 점수 : " + s.getKor());
		System.out.println("영어 점수 : " + s.getEng());
		System.out.println("수학 점수 : " + s.getMath());
		System.out.println("==================");
		
	}
}
	
