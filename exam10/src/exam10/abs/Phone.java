package exam10.abs;

public abstract class Phone {
	//추상화 메서드
	public abstract void openingLogo();
	
	//자식클래스가 powerOn을 호출하면 openingLogo는 자식이 구현한것처럼 대체된다.
	public void powerOn() {
		this.openingLogo(); // 자식 클래스가 정의한 메서드내용이 출력
		System.out.println("핸드폰이 켜집니다");
	}
	
	public void powerOff() {
		System.out.println("핸드폰이 꺼집니다");
	}
}
