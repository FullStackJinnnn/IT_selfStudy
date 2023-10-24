package study.thread.multiple;

public class AddBank implements Runnable {

	private Bank b;
	private String worker;
	
	public AddBank(String worker, Bank b) {
		this.worker = worker;
		this.b =b;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			b.addMoney(1000);
			System.out.println(this.worker + "현재 잔고 :" + b.getMoney());
		}
 		
	}
}
