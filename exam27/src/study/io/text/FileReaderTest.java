package study.io.text;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {
		
		//달라진것 
		//FileInputStream re = null;-> 바이트단위로 읽기때문에 한글이 깨진다
		FileReader re = null;//close 때문에 위에 선언 -> 캐릭터단위로 읽어서 한글이 깨지지 않는다.
		try {
			re = new FileReader("test.txt");
			
			int read = 0;
			char[] chArray = new char[50];
			
			//읽을 것이 없으면 -1을 리턴!
			while( (read = re.read(chArray)) != -1 ) {
				System.out.print(new String(chArray,0,read)); //배열로 넣으면 속도차이가 많이난다.
				//System.out.print((char)read); read()는 int값이기때문에 char로 형변환
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(re != null) {
					re.close();
			}
				
			}catch (Exception e) {
			e.printStackTrace();
			}
		
		}
	}
}
