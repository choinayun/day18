package day18;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
	
		String id = "abcd";
		String pwd = "333";
		
		while(true) {
			
			System.out.println("등록 아이디 입력");
			id = input.next();
		
			File path = new File("D:/평일오후취업반_cny/06.13 수업/"+id+".txt");
	
			if( path.exists() ) { // 해당 위치의 파일 또는 폴더가 존재할 때 true 
				// exists : 해당하는 위치에 파일 또는 폴더에 접근 가능한지 확인
				
				System.out.println("존재하는 아이디 입니다");
				
			}else { // 해당 파일이 없을 때 
				System.out.println("비밀번호 입력");
				pwd = input.next();	
				
				FileOutputStream fos = new FileOutputStream(path);
	
				fos.write(id.getBytes());
				fos.write(pwd.getBytes());
				
				System.out.println("등록되었습니다.");
				break;
			}
		}
		

		
	}
}
