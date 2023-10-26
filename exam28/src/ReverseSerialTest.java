import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

import study.io.serial.Person;

public class ReverseSerialTest {

	public static void main(String[] args) {
		
		FileInputStream fs = null;
		ObjectInputStream io = null;
		
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			
		}try {
			
			fs = new FileInputStream("object_data.txt");
			io = new ObjectInputStream(fs);
					
			while(fs.available() !=0 ) {
				Person p = (Person)io.readObject();
				System.out.println("이름 :" + p.getMyName() + ", 나이 : " + p.getAge());
			}
			
			if(io != null) { //보통 보조스트림을 먼저 닫는다.
				io.close();
			}
			
			if(fs != null) {
				fs.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
