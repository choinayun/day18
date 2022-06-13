package day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 파일 입출력
// 디스크에 저장하는 방식 
// 영구저장을 하기위해 사용

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/평일오후취업반_cny/eclipse-jee-2022-03-R-win32-x86_64/aaa.txt");
		// 괄호 안에 파일 위치 경로 
		// 역슬러시 두개 - 슬러시 하나로 변경하고 파일 생성 
	
		FileOutputStream os = new FileOutputStream(path);
		// stream : 연결통로 
		// FileOutputStream : 가장 기본이 되는 stream 
		// add throws 선택해주고 FileNotFound 삭제 Exception 만 남겨두고 실행 
		
		os.write('A');
		os.write(97);
			
		String s = "hello";
		os.write( s.getBytes() );
		// getBytes : 사용하는 문자열을 바이트형식으로 변환 
	}
}






