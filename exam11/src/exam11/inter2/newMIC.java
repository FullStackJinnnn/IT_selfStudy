package exam11.inter2;

public class newMIC implements BlutoothMIC2{
	@Override
	public void music() {
		System.out.println("스피커에서 소리나와");
	}

	@Override
	public void sing() {
		System.out.println("마이크에 대고 노래불러");
	}

}


