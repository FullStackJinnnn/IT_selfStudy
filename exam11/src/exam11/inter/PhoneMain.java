package exam11.inter;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반적으로 다음과 같이 객체를 선언하지만 ,
	//	ApplePhone app = new ApplePhone();
		// 인터페이스에선 부모타입으로 객체를 선언 할 수 있따.
		//삼성폰, 엘지폰을 만들던 모든 메서드를 사용 할 수 있기 때문이다.
		//인터페이스는 다중 상속이 가능하다.
		Phone app = new ApplePhone();
		
		app.powerON();
		
		app.watchYoutube();
		app.charge();
		app.charge();
		app.watchYoutube();
		app.watchYoutube();
		app.watchYoutube();
		app.watchYoutube();
		
		//app.powerOff();
		
	}

}
