package quize01;

import java.io.Serializable;
import java.util.Scanner;

public class QuizeMain {

	public static void main(String[] args) throws Exception {
		
		int num;
		Scanner input = new Scanner(System.in);
		
		Student s = new Student();
		
		while(true) {
			
			System.out.println("1. 학생등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 검색");
			System.out.println("5. 종료");
			System.out.println(">>>");
			num = input.nextInt();
			
			switch(num) {
			
				case 1 :
					s.register();
					break;
				case 2 : 
					s.modify();
					break;
				case 3 : 
					s.delete();
					break;
				case 4 : 
					s.search();
					break;
				case 5 : 
					System.exit(0);
					break;
			}
			
		}
	}	
}
