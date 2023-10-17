package exam11.inter2;
// BlutoothMIC2에 인터페이스 2개가 상속되어있고 그것을 newMIC에 상속.
//마지막엔 항상 클래스로 상속시켜 메서드를 재정의 해줘야 하는 것 같다.
public class newMIC implements BlutoothMIC2{
	@Override
	public void music() {
		System.out.println("스피커에서 소리나와!!!");
	}

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래불러!!!!");
	}

}


