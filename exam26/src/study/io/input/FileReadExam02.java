package study.io.input;

import java.io.FileInputStream;
import java.io.IOException;

//절대경로와 상대경로
//절대경로는 물리적인 경로이다. c://program//Java// ...etc
//상대경로는 내위치를 기준으로 지정하는 경로이다.
public class FileReadExam02 {
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
		byte[] buffer = new byte[50];
		//read(byte[] arr)은 리턴으로 읽은 개수
		//한글이 깨지지 않을려면 바이트배열로 읽어오는게 좋다.
		while((read = in.read(buffer)) != -1) {
			//System.out.write(buffer,0,read);//write라는 메서드는 바이트배열을 출력해줄 수 있다.
			System.out.print(new String(buffer,0,read));//read 대신 buffer.length를 사용하면 
			//딱 맞아 떨어지지 않아 버퍼에 남아있는것들이 그대로 같이 출력되어 이상하게 된다.
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
