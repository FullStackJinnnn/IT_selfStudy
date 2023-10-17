package exam13;

public class Exam01Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.introduce();
		
		//익명클래스란 클래스의 기능을 1회용으로 쓰려고 만든것
		//익명클래스도 내부클래스이다. 지역클래스와 같은 성향
		//선언부 마지막에 ; 세미클론 필요 
		//이름이 없는 클래스
		//내부기능을 override로 구현
		//내부클래스이며 지역클래스의 제한기능을 동일 하게 적용!
		
		
		String a = "한글";
		
		
		Person p2 = new Person() { // 객체화 시키는 생성자가 아니다.
			//이름이 있는것 처럼 보이지만 그냥 담을 곳이 필요한것 뿐이다. 이름은 없다.
			//이름을 가진다는건 기억되어서 메모리에 저장된다는것 하지만 익명 클래스는 기억이 안된다. 메모리에 기억이
			//되지않고 한번 사용한 후 사라진다.
			@Override
			public void introduce() {
				//a= "멋진 + a ; // 익명 클래스도 지역클래스 이기때문에 final 변수만 사용 바꾸면 안됌
				System.out.println("a +나는 생각하는사람");
			}
		};
		
		p2.introduce();
		
		//익명클래스는 메서드가 정의되어있는 재정의할 필요가 없는 일반클래스보단 인터페이스나 추상화클래스는 
		//구현해야할 추상화 메서드가 필요하기 때문에 익명클래스를 쓰는것도 좋다.
	
	}
}
