package exam05;

public class Bank {
	
	private int money;
	
	//입금
	public void setMoney(int money) {
		if (money<0) {
			System.out.println("잘못 입력되었습니다.!");
			return; // 일찍 종료 else대신 사용할수있다 실행문 종료  
		}
		this.money = money ; // this는 class자기자신을 의미 
	
	}
	//돈 출력
	public int getMoney() {
		return money;
	}
}
