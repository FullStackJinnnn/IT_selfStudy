package study.code.thread;

public class FlagMain {

	public static void main(String[] args) {
		
		//Runnable을 상속하여 만든 객체는 Thread 객체에 넣어서 실행해야함. 
		
		Thread thflag = new Thread(new Flag());
		thflag.start();
		
		Runnable rn = () ->{	
			for(int i = 1; i <= 10; i++) {
				if( i%2 ==1 ) {
					System.out.println("백기올려");
				}else
					System.out.println("청기올려");
			}
		};
		System.out.println("================");
		Thread thflag2 = new Thread(rn);
		thflag2.start();
			
	}

}
