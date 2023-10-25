package study.thread.multiple;
//블록 동기화 처리
//메서드 동기화의경우 하나의 메서드가 처리시간이 길어지면 성능에 영향을 미칠 수 있다
//이런경우 특정 영역만 동기화 처리를 할 수 있따.
public class BankMain2 {
	public static void main(String[] args) {
		Bank2 b = new Bank2();
		Thread work1 = new Thread(new AddBank2("1번", b));
		Thread work2 = new Thread(new AddBank2("2번", b));
		
		work1.start();
		work2.start();
	}
}
