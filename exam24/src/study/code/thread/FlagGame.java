package study.code.thread;

public class FlagGame {
	public static void main(String[] args) {

		
		Runnable white = () ->{
			while(true) {
				System.out.println("백기올려");
			}
		};
		
		Runnable blue = () ->{
			while(true) {
				System.out.println("백기올려");
			}
		};
		
		Thread w = new Thread(white);
		Thread b = new Thread(blue);
				
		w.start();
		b.start();
			
				
	}
}
