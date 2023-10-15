package exam08.overide;

public class computer {
// 메서드 오버라이딩이란!
//상속관계에서 상위클래스가 상속해준 메서드의 내용을 다시 정의하여
//메서드를 구현하는 기술
	
//단 메서드의 이름,리턴타입은 동이랗게 지정해야한다.
	 
	public void powerOn() {
		System.out.println("전원ON");
	}
	
	public void powerOff() {
		System.out.println("전원OFF");
	}
}
