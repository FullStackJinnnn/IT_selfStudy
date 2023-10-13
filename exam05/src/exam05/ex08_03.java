package exam05;

public class ex08_03 {
	public static void main(String[] args) {
		int money = 33000;
		int count = 0;
		while(true) {
			if(money < 1500) {
				System.out.println("버스를" + count + " 만틈탓다");
				System.out.println("버스카드 충전요망!");
				return; //break 대신 return을 써도 된다. 
			}
			
			money -= 1500;
			count++;
		}
		
		//setter 입력을 제어하기 위한 메서드
		//getter 출력을 제어하기 위한 메서드
	}
}
