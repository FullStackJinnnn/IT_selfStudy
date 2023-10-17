package exam12.st;

public class PrintOut {
	//정적 내부 클래스란
	//클래스도 정적으로 선언할 수 있으며 주로 외부 클래스의 static 메서드에서 사용될 목적으로 선언된다.
	
	//private String line ="\n";
	//정적 메서드 또는 클래스는 내부에서 맴버변수 또는 인스턴스호출이 불가능하다.
	//그이유는 메모리에 올라가는 시점이 다르고 static이 먼저올라가고 객체화가 필요한 애들은 내부에서 사용할 수없다.
	
	//스테틱이 잇는 곳에서 스테틱이 아닌 필드는 사용할 수 없다.
	//정적클래스 선언
	public static class Out{ //정적 내부 클래스 -> 외부 클래스를 객체화 하지않고 쓸수있다!!!!!!!!
		public void println(String str) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		//PrintOut out2 = new PrintOut();
		//PrintOut.Out out= out2.new Out(); 내부 static 클래스가 아니면 이 두줄로 객체화 해야하지만
	    // static 을 사용하면 다음처럼 내부클래스만 객체화 하면 된다. 외부클래스 객체회 필요 X 
		Out out = new Out(); 
		
		String str = "정적 내부클래스";
		
		out.println(str);
		
		
		//* 내부 클래스는 Public으로 두는것이 좋은 편이다 Private 으로 지정햇을때 외부에서 접근하기가 매우매우매우 어렵다.
	}
	
}
