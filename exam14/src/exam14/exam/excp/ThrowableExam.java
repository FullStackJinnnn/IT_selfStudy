package exam14.exam.excp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowableExam {
//예외 던지기란!
// 메서드한테 쓰이는건데 메서드를 호출 했을때 내부에서 에러가 났을떄 
	//내부에서 처리하지  않고 호출 한 애가 처리하는 것.
	//throw 뒤에 원하는 예외타입을 넣으면 된다.
	public static void checkYourSelf(Scanner scan) throws InputMismatchException {
		//checkYourself 가 호출한쪽			//위 코드는 try catch를 지워도 에러가 나지 않는다.
										// 그 이유는 nputMismatchException 이 옵셔널 기능이기 떄문
										//시스템이 판단하진않고 처리하려면 하는것.
		System.out.println("1. 사람과 있는것이 좋다 / 2. 혼자 가 좋다");
		System.out.println("선택 >>");
		
		int check = scan.nextInt();
		
		if(check ==1) {
			System.out.println("당신은 외향적");
		}else {
			System.out.println("내향적");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	try {
		
		System.out.println("===성격유형검사를시작합니다.==");
		ThrowableExam.checkYourSelf(scan);
		
		
	}catch (InputMismatchException e) {
		System.out.println("키더브 입력이 잘못되었습니다.");
	}finally {
		
		if(scan != null) {
			scan.close();
		}
	}

	}
}
