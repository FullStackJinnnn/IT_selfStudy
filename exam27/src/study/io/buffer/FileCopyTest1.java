package study.io.buffer;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest1 {
	public static void main(String[] args) {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			
			in = new FileInputStream("test.jpg");
			out = new FileOutputStream("test_copy.jpg", false);
			
			long start = System.currentTimeMillis(); //현재 시간을 1/1000초로 확인
		
			System.out.println("이미지 복사 시작");
			
			int read = 0;
			while((read = in.read()) != -1) {
				out.write(read);
			}
			
			System.out.println("이미지 복사 시작");
			
			long end = System.currentTimeMillis();
		
			double time = (double)(end -start) / 1000;
			
			System.out.println("걸린시간 :" + time);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(out != null) {
					out.close();
				}
				
				if(in != null) {
					in.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
