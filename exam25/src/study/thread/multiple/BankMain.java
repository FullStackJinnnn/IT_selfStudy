package study.thread.multiple;

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();
		Thread work1 = new Thread(new AddBank("1번", b));
		Thread work2 = new Thread(new AddBank("2번", b));
		
		work1.start();
		work2.start();
	}
}
