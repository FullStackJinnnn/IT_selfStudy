package exam06;

public class Person {

	
	//생성자 선언 생성자의 이름은 클래스의 이름과 동일 하게 사용 -> 자바 문법 
	//생성자는 리턴타입 지정 X 기본상황에서 호출하지 않고 객체를 선언할때만 호출 가능 
	//리턴여부자체가 필요가 없다.
	public Person() {
		System.out.println("클래스 생성!");
		//생성자를 직접 만들면 시스템이 만드는걸 사여요하지 않고 개발자가 만든걸 사용 
	}
	// 오바로딩이란?!
	//기본적으로 같은 클래스 내에서 메서드or생성자 이름 중복사용 불가
	
	//메서드가 지닌 파라미터(매개변수)의개수를 다르게 하거나 개수가 같아도
	//데이터 타입을 다르게 하면 다른 메서드로 인식하게 하는 기술!
	
	
}
