package study.io.change;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class StreamWriterTest {

	public static void main(String[] args) {
		
		FileOutputStream out = null;
		OutputStreamWriter ow =null;
		
		try {
			
			out = new FileOutputStream("stream.txt",false);
			ow = new OutputStreamWriter(out, "UTf-8");
			
			System.out.println("파일생성 시작");
			
			String[] arr = {"안녕하세요", "겅강조심"};
			
			for(String str : arr) {
				ow.write(str +"\n");
			}
			
			System.out.println("파일생성완료");
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if( ow != null) {
					ow.close();
				}
				
				if( out != null) {
					out.close();
				}
				
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
