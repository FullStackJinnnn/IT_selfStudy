package study.io.change;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class StreamReaderTest {

	public static void main(String[] args) {
		
		
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			
			in = new FileInputStream("test.txt");
			// 인코딩을 설정
			// 파일이 생성할때 사용한 인코딩과 같아야 한다.
			// 인코딩을 기입하지 않으면 system 에 따른다.
			is = new InputStreamReader(in, "UTF-8");
										//"euc-kr"이라고 쓰면 한글이 깨진다
										// 아무것도 안쓰면 이크립스 기본인코딩인 UTF-8을 따라가기 때문에 안꺠진다.
			int read = 0;
			
			while ( (read = is.read()) != -1) {
				System.out.print((char)read);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
