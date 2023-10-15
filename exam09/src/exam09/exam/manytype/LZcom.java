package exam09.exam.manytype;

public class LZcom implements Computer{
//오버라이드 마우스 클릭으로 자동추가 가능 
//implements와 extends 의 차이 !!!!!
//자바는 다중상속을 지원하지 않는다. 대신 implements(인터페이스)가 등장했다. 여기서 다중상속이란 부모클래스가 두개이상 존재하는 것을 의미한다.
//implements의 가장 큰 특징은 이렇게 부모의 메소드를 반드시! 오버라이딩(재정의)해야 한다. 또한 이 implements는 다중상속을 대신해준다.
	
//extends는 일반 클래스와 abstract 클래스 상속에 사용되고, implement는 interface 상속에 사용된다.
//class가 class를 상속받을 땐 extends를 사용하고, interface가 interface를 상속 받을 땐 extends를 사용한다.
//class가 interface를 사용할 땐 implements를 써야하고
//interface가 class를 사용할 땐 implements를 쓸수 없다.
//extends는 클래스 한 개만 상속 받을 수 있다.
//extends 자신 클래스는 부모 클래스의 기능을 사용한다.
//implements는 여러개 사용 가능하다.
//implements는 설계 목적으로 구현 가능하다.
//implements한 클래스는 implements의 내용을 다 사용해야 한다.
//extends는 클래스를 확장하는 거고 implements는 인터페이스를 구현하는 것이다.
//인터페이스와 보통 클래스의 차이는 인터페이스는 정의한 메소드를 구현하지 않아도 된다.
//인터페이스를 상속받는 클래스에서 인터페이스에 정의된 메소드를 구현하면 된다.	
	
	
	@Override
	public void powerOn() {
		System.out.println("LZ주거!");
		System.out.println("전원 ON");

	}

	@Override
	public void powerOff() {
		System.out.println("LZ주거!");
		System.out.println("전원 OFF");

	}

	
	
	
}
