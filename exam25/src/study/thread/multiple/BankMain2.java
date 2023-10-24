package study.thread.multiple;

public class BankMain2 {
	public static void main(String[] args) {
		Bank2 b = new Bank2();
		Thread work1 = new Thread(new AddBank2("1번", b));
		Thread work2 = new Thread(new AddBank2("2번", b));
		
		work1.start();
		work2.start();
	}
}
