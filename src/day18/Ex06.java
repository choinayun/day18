package day18;

import java.io.*;
import java.util.Scanner;

class AAA implements Serializable{
	
	String name;
	String addr;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

public class Ex06 {

	public static void main(String[] args) throws Exception {
		// 객체 자체를 저장할 수 있는 object stream  
		
		Scanner input = new Scanner(System.in);
		String name, addr;
		
		System.out.println("1. 저장");
		System.out.println("2. 가져오기");
		int num = input.nextInt();
		
		String path = "D:/평일오후취업반_cny/06.13 수업/";
		
		AAA info = null;
		// new 를 써서 객체를 만들어줘야 기능사용 가능 
		// 위 내용은 그냥 변수를 만들어준것 
		
		if(num == 1) {
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("주소 입력");
			addr = input.next();
			
			info = new AAA();
			info.setName(name);
			info.setAddr(addr);
			
			File path02 = new File(path + name + ".txt");
			
			FileOutputStream fos = new FileOutputStream(path02);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject( info );
			
			oos.close(); bos.close(); fos.close();
			System.out.println("저장 되었습니다");
			
			// 오류 발생 해결방법 
			// 객체를 byte 형식으로 변환(직렬화) 해서 파일에 저장 
			// 해당 클래스 implements 해주고 Serializable 해주기 
			// 다시 가져올 땐 byte를 객체 형태로 변환(역직렬화) 
			
		}else {
			// D:/평일오후취업반_cny/06.13 수업/
			File list = new File(path);
			String[] li = list.list();
			
			for(int i = 0; i < li.length; i++) {
				System.out.println( li[i] );
			} 
			// for(String a : li) {System.out.println(a);}
			
			System.out.println("확인할 이름 입력");
			name = input.next();
			File p = new File(path + name + ".txt");
			// 파일 삭제 : p.delete(); 
			
			FileInputStream fis = new FileInputStream(p);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			info = (AAA)ois.readObject();
			System.out.println("이름 : " + info.getName());
			System.out.println("주소 : " + info.getAddr());
		}
		
	}
}












