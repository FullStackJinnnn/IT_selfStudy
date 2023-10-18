
package exam14.exam.excp;

import java.util.Scanner;

public class InputNumberExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int val = 0;
		
		while(true) {
			
			try {
				
				System.out.println("숫 자입력 (1~50)");
				val = scan.nextInt();
				//이대로 작성했을떄 무한루프의 이유 ! 
				//스캔으로 키입력을 받으면 버퍼라는곳에다가 데이터 저장 
				//a라고 입력을하면  미스매치 나 exception으로 가짐 그리고 처리를 하면 다시 scan으로 오는데 
				//a가 계쏙 버퍼에 남아잇어서 새로 들어온걸로 찾각해 계쏙 에러가난다.
				//무한루프 제거를위해 스캐너 버퍼를 비워야한다. 
				
				if (val == -1) {
					System.out.println("종료!");
					break;
				}else if (val >50 || val < 1) {
					//새로운 객체를 던질것이다.
					throw new Exception("숫자 허용범위 X");
				}	//throws 는 메서드 throw는 내가던지겠다.
				
				
			}catch (Exception e) {//이리와서 처리하고 다시 버퍼로 가게된다.
				scan.nextLine(); //입력받기전에 이전 내용
				System.out.println(e.getMessage() == null ?  "입력에 ㅁ문제발생생" : e.getMessage());
				//버퍼를 null로 비우고 다시 입력 받는다.?
				//조건 ? value1 : value2 식 
				// 조건이 참이면 value1실행 아니면 value2실행 
			}
		}	

		if(scan != null) {
			scan.close();
		}
	}
}


