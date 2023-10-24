package study.code.thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		MyThread th = new MyThread();
		th.setName("더하기 스레드");
		//스레드 시작!
		th.start();//다른 동작 시작 하고 그냥 코드가 흘러가기 떄문에 true가 먼저 나온다.
		System.out.println(th.isAlive());
	}
}
