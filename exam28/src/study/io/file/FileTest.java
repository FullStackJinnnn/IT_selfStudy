package study.io.file;

import java.io.File;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		
		File f = new File("C:\\eclipse\\workspace\\exam28\\src\\study\\io\\file\\test.txt");
		
		if(f.exists()) {
			System.out.println("존재함");
		}else {
			System.out.println("존재 X");
		}
		
		System.out.println("파일 크기 : " + f.length() + "(byte)");
		System.out.println("파일 경로 : " + f.getPath());
		System.out.println("파일 절대경로 :" + f.getAbsolutePath());
		
		System.out.println("파일 이름 : " + f.getName());
		
		System.out.println("파일인가 ? : " + f.isFile());
		System.out.println("폴더인가 ? : " + f.isDirectory());
		System.out.println("부모 : " + f.getParent());
		
		File f2 = new File("C:\\Test\\tes.txt");
		//파일을 쓸경우, 폴더가 없으면 에러!
		if(!f2.getParentFile().exists()) {
			f2.getParentFile().mkdirs();
		}
		
		FileOutputStream out = null;
		try {
			
			out = new FileOutputStream(f2);
			out.write('A');
			out.write('B');
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			try {
				
				if(out != null) {
					out.close();
				}
				
			}catch (Exception e) {
			
			}
		}
				
	}
}
