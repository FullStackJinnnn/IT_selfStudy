package exam12.member.cls;

public class CalcMain {
	public static void main(String[] args) { //메인은 static이 붙어있다!
		//static 은 객체화 하지 않고 사용가능 
		
		Calculator cal = new Calculator(12, 20); // 생성자를 통해서 private변수에 쉽게 접근이 가능하구나....
		//내부클래스 객체화 
		Calculator.Calc calc = cal.new Calc(); //내부클래스 객체화 
		
		//내부클래스 메서드 실행
		System.err.println("더하기 값"+ calc.add());
		System.err.println("더하기 값"+ cal.add2()); //테스트용~~ 
		
		
	}
}
