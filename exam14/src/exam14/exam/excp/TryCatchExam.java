package exam14.exam.excp;


//예외처리!!!!!!!!!!!!!
public class TryCatchExam {
	public static void main(String[] args) {
		try {
		int num = 15;
		int result = num /0;
		
		System.out.println(" 결과 "+result);
		//에러가 의심되는곳 다음에 catch 사용 ,,,?
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); //내부에서 에러난 내용전체 출력
			System.out.println(e.getMessage()); // 에러 메시지만 출력
		}
		
		
		System.out.println("프로그램 종료");
		//예외처리를하면 에러가났을때 끝나지않고 끝까지 진행된다.
		//의
	}
}
