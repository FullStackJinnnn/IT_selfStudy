package exam14.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			int[] cards = {4,2,5,7,1,3};
			
			System.out.println("몇번째 카드를 뽑으실껀가요");
			int cardIndex = scan.nextInt();
			
			System.out.println("뽑은 카드번호는:" + cards[cardIndex]);
		//모든 에러에 대한 똑같은 예외처리 하는법 Exception
		//예외처리의 끝판왕 exception은 가장 밑에 있어야한다.
		//try catch는 close기능은 없고 문장의 맞침표 기능만 있다. finalㅣㅛ
		//finally 는 catch가 발동되든 안되든 마지막엔 꼭 실행된다.	
			
		}catch (Exception e) { //키입력 잘못했을떄 ..?
			System.out.println("키 입력이 잘못되었습니다.");
		}finally {
			//예외 발생유무와 관계없이 무조건 실행
			//꼭 처리해야할 내용을 적용시키기 위해 finally 사용 
			System.out.println("예외끝");
			scan.close();
			
		}
	}
}
