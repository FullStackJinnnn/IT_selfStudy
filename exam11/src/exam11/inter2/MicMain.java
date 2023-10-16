package exam11.inter2;
//첫번쨰방식은 클래스에 인터페이스 여러개
//두번째방식은 인터페이스에 다중상속
public class MicMain {
	public static void main(String[] args) {
		newMIC mic = new newMIC();
		
		mic.sing();
		mic.music();
	}
}
