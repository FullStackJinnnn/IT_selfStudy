package exam12.member.cls;

public class Calculator {

		private int val1;
		private int val2;
		
		public Calculator(int val1, int val2) {
			this.val1 = val1;
			this.val2 = val2;
		}
		public int add2() {
			return val1 + val2;
		}
		
		//내부클래스
		//내부클래스는 외부클래스의 변수/메서드 사용가능
		public class Calc{
			public int add() {
				return val1 + val2; //생성자를통해 접근한 private 변수 
			}
		}
}
