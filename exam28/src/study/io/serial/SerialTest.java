package study.io.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
	public static void main(String[] args) {
		
		
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		
		try {
			fs = new FileOutputStream("object_data.txt", false);
			os = new ObjectOutputStream(fs);
			
			Person p1 = new Person("김철수",30);
			
			os.writeObject(p1);
			System.out.println("파일 생성");
			
		} catch (Exception e) {
			// ODO: handle exception
		}finally {
			
			try {

				
				if (os != null) {
					os.close();
				}
				
				if(fs != null) {
					fs.close();
				}
	
			} catch (Exception e) {
				
			}
		}
	}
}
