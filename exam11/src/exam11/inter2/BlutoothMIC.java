package exam11.inter2;
//인터페이스와 클래스의 다중상속
//인터페이스 끼리의 상속도 가능 
//인터페이스 2개일떄 하나의 클래스와 다중상속 보다는
//인터페이스 2개를 1개로 묶어서 1:1 로 상속하는걸 선호
//그이유는 부모의 인터페이스 타입으로 자식을 객체화할때 부모가 1개여야 더 편하다.

public class BlutoothMIC implements MicroPhone, Speaker {

	@Override
	public void music() {
		System.out.println("스피커에서 소리나와");
	}

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래불러");
	}

}
