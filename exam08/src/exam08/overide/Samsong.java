package exam08.overide;

public class Samsong extends computer{

	
	// @Override 가 숨어져있다 Anootation 이라고 함. 
	//Annotation 이란
	//메서드의 역할,상태,기능들을 부여하는 키워드.
	public void powerOn() {
		super.powerOn();
		System.out.println("헬로우삼송");
		System.out.println("컴터실행");
	}
	
	public void powerOff() {
		System.out.println("굿바이삼송");
		System.out.println("컴터종료");
	}
	
}
