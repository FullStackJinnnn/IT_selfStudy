package exam11.inter;
//interface는 클래스가 아님 
//모든 메서드가 추상화 메서드이다.
//상수만 필드로 가능하다.
//생성자를 통한 선언이 불가능
//생성자 호출 불가능

//인터페이스는 기능 명세서라고도 부른다.
//그이유는 모든 메서드가 정의되어있고
//정의가 되어있다는 기능이 규격화되어있다는것.
//인텊이스는 상속과 좀 다르다. A,B,C의 구현클래스가 인터페이스가 가지고있는 규격기능을 구현하고
//기능 클래스가 인터페이스를 통해서 A,B,C를 가져다 쓴다.

//구현 클래스들의 기본 틀을 제공하면서, 다른 클래스 코드들과의 사이에서 중간 매게 역할을 한다.

//추상 클래스는 자식 클래스들의 공통적 특징을 추출하고 제공하는 것이 주된 역할이었다면, 인터페이스는 그뿐 아니라 다른 클래스 코드들과의 중간 매게 역할을 하는 것을
//중점으로 생각할 수 있다.
//인터페이스에서는 public abstract void add(); 같은 식으로 
//public abstract를 붙여야 하지만 
// 생략을 해도 된다. 어차피 추상화 메서드라는것을 알기 때문에

// * 상수 선언하는법 
// 상수란 항상 같은값을 표현한다. 
//다음 코드는 항상 메모리에 30으로 떠있음.
// public static final int a = 30;

//상수 표기법!
//모두 대문자, 언더바로 표현
// SUPER_MAN
// public static final int PI = 3.14;

public interface Phone {
	public static final int MAX_BATTERY_CAPACITY =100;
	
	public abstract void powerON();
	void powerOff();
	boolean isOn();
	void watchYoutube();
	void charge();
	
	//인터페이스를 연결할떄는 implements(구현하다)
	//클래스확장이아니라 부모클래스를 구현하기 위해 만드는것
	
}
