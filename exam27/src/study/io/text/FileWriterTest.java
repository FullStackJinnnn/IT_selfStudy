package study.io.text;

import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("write.txt", false);
			
			fw.write("안녕하세요. 날씨가 더워요!\n");
			fw.write("비는 싫어요 \n");
			fw.write("have a good day! \n");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fw != null) {
					//예전에는 fw.flush()를 했어야한다
					//하지만 close기능에 auto flush기능이 탑재되어있어서 
					//이젠 안해도 된다.
					fw.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
