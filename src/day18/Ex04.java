package day18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// Ex03 에서 했던 작업이
// 하나씩 가져오고 나가고 하는 방식이여서 비효율적 
// 위 문제를 해결하려면 보조stream 사용해야 한다

public class Ex04 {

	public static void main(String[] args) throws Exception {
	
		File path = new File("D:/평일오후취업반_cny/06.13 수업/aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 보조Stream : 한번에 데이터를 전송하는 stream 
		
		for(int i = '1'; i < '9'; i++) {
			// Thread.sleep(2000);
			bos.write(i); 
			// 저장소에만 저장이 된 상태 
			// file 로 내용을 전송해야 
		}
		bos.flush();
		// 저장소에 있는 값을 비워주세요 (file로 값을 전송)
	}
}
