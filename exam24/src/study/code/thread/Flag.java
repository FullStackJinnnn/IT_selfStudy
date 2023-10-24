package study.code.thread;

public class Flag implements Runnable {

	@Override
	public void run() {
		
		for ( int i = 0; i < 10; i++) {
			if( i % 2 ==0) {
				System.out.println("백기올려");
			}else
				System.out.println("청기올려");
		}
	}
	
}
