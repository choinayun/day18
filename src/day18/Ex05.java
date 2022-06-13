package day18;

import java.io.*;

public class Ex05 {
	
	public static void main(String[] args) throws Exception {
		
		File path = new File("D:/평일오후취업반_cny/06.13 수업/aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(path);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		DataOutputStream dos = new DataOutputStream(bos);
		// 여러가지의 값을 처리해주는 stream
		
		// dos.write(); 했을 때 다양한 형식으로 출력이 가능 (형변환 필요없음)
		String s = "안녕하세요";
		dos.writeUTF(s);

		// stream 을 생성해서 열어주면 마지막엔 닫아줘야 효율적으로 사용 가능 
		// 생성한 순서와 반대로 역순으로 닫아주면 된다
		dos.close(); 
		bos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String str = dis.readUTF();
		System.out.println("가져온 내용  : " + str);
		
		dis.close();
		bis.close();
		fis.close();
	
	}

}
