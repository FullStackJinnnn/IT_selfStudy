package study.thread.multiple;

public class Bank2 {
	private int money;
	
	public int getMoney() {
		return this.money;
	}
	//스레드를 동기화처리해주면 자원부여에 대한 순서부여가 가능해져서 스레드가 같은 자원을 점유해 발생하는 오류를 막을 수 있다.
	public void addMoney(int money) {
		this.money += money; 
		
	
	}
	
}
