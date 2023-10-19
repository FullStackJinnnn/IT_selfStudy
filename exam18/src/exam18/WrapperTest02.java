package exam18;

public class WrapperTest02 {

		public static void main(String[] args) {
			
			
			String intStr = "70";
			String doubleStr = "60.77";
			
			//valueOf() --> 정수  또는 문자형 타입 정수, 리턴타입 Integer
			// palseInt() --> only 문자형 타입 정수,  리턴타입 : int
			//wrapper 클래스를 대부분 형변환 할 때 많이 쓴다.
			//외부에서 데이터를 받을때 하나의 String 으로 받는 경우가 많다.
			//숫자 문자를 가려서 읽기가 힘들기 때문에 문자 통일시켜버리는게 좋다. 치환할때 많이 씀
			
			int myScore = Integer.parseInt(intStr);
			double cutLine = Double.parseDouble(doubleStr);
			
			
			if(myScore >= cutLine) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
				
				
				//* 날자를 읽는 클래스 Calender 추상화 클래스이기떄문에 Instance로 얻어서 사용해야한다.
				//이미 만들어진 Instance로 선언 해야함.
				// Calender cal = Calender.getInstance();
				// 일,월,화,수,목,금,토 가 1주 
			}
		}
		
}
