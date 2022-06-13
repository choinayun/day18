package day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/평일오후취업반_cny/06.13 수업/aaa.txt");
		
		FileInputStream fis = new FileInputStream(path);
		// 파일의 내용을 불러오는 stream 
		// 실행 했을 때 오류가 뜨면 해당하는 위치에 파일이 존재하지 않는 것 
		
		while(true) {
			
			Thread.sleep(1000);
			
			int res = fis.read();
			
			// System.out.println("res : " + res);
			// 마지막으로 더 이상 가져올 내용이 없을 때 
			// res 값이 -1 이 된다 ( -> eof 값이라고 부른다)
			
			if(res < 0) 
				break;
			System.out.println((char)res);
			// int 형태로 가져오니 숫자로 결과 출력 
			// char 로 형변환해서 가져오기
		
		}
		
		
	}
}
