package study.thread.multiple;

public class AddBank2 implements Runnable {

	private Bank2 b;
	private String worker;
	
	public AddBank2(String worker, Bank2 b) {
		this.worker = worker;
		this.b = b;
	}

	@Override
	public void run() {
		//일부분 동기화처리 
		synchronized (b) {
			
			for (int i = 0; i < 10; i++) {
				b.addMoney(1000);
				System.out.println(this.worker + "현재 잔고 :" + b.getMoney());
			}
		}
 		
	}
}
