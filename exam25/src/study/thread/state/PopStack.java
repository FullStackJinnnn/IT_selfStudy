package study.thread.state;

public class PopStack extends Thread {

	private Storage st;
	
	public PopStack(Storage st) {
		this.st = st;
		
	}
	
	public void run() {
		try {
			while(true) {
				Thread.sleep(100);
				System.out.println("짐 5개씩 나르기");
				this.st.popStack(5);
				
			}
			
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
