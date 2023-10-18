package exam13;

public class EventMain {
// 버튼 클래스
	
	public class Button{
		private ButtonClickListener listener; //인터페이스 버튼클릭리스너타입 변수 
		//setter를 통해 변수접근 
		public void setListener(ButtonClickListener listener) { //리스너를 파라미터를 private 리스너에 접근하게 지정 해주는 메서드
			this.listener = listener;
		}
		
		
		public void click() { 
			if(this.listener != null) {
				this.listener.click ();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		EventMain main = new EventMain(); //이벤트 메인 객체화 
		//내부클래스 선언
		EventMain.Button button = main.new Button(); //내부함수 객체화 
		//인터페이스는 객체화를 할 수 없는데 인터페이스를 new 라고 선언해서 만들거면 
		//객체화 없이 익명클래스 를 통해서 만드는것.
		//객체화가 된다 안된다의 차이
		//객체화는 자기의 이름을 가지고 만드는것 익명클래스는 자기 자신을 수현만 해놓은것
		ButtonClickListener listener = new ButtonClickListener() {  // 인터페이스를 new로 선하하면 익명클래스 생성 
			//익명클래스가 만들어졌다.
			
			@Override
			public void click() {
				System.out.println("버튼이눌렷습니다");
				
				
			}
		};  // 익명클래스 세미콜롬 필수 
		// 버튼을 누루는 이유는 여러가지 한번 눌렀을떄 그이벤트에 대한 처리를 위해 익명 클래스를 쓴다.
		button.setListener(listener);
		button.click();
		
			
		
	}

}
