package study.io.input;

import java.io.FileInputStream;
import java.io.IOException;

//절대경로와 상대경로
//절대경로는 물리적인 경로이다. c://program//Java// ...etc
//상대경로는 내위치를 기준으로 지정하는 경로이다.
public class FileReadExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO는 파일이 없을수도있고 없을수도있다 checked exception이 된다. 직접 체크해줘야한다?
		FileInputStream in = null;
		try {
		//try catch 안에 선언되면 finally는 모른다.
	//	FileInputStream in = new FileInputStream("text.txt");
		in = new FileInputStream("text.txt");
		//파일이 끝이면 -1을 뱉는다.
		//read() 메서드가 int단위로 리턴하기때문에 int로 선언
		int read = 0;
		
		while((read = in.read()) != -1) {
			//read = in.read();
			//아스키코드표에 의해서 문자--> 숫자로 표기하여 리턴
			System.out.print((char)read); //ln을 쓰면 줄바꿈까지 읽어서 안된다.
		}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if( in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} //close 자체가 IOException을 받는 애이다.
			}
		}

	}
}
