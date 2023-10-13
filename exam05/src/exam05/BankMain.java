package exam05;

public class BankMain {
	public static void main(String[] args) {
		Bank b= new Bank();
		
		//b.setMoney(-500);
		//b.setMoney(1000);
		//b.money =1000; //int Money가 privat이 아니면 그냥 b.money로 참조 가능 
		//private 최상의 접근자 내부에서만 사용 가능 외부 접근 불가 데이터보호 
		//그럴떄 setter getter 사용 
		
		//set + 변수명 
		//get + 변수명 
		//private로 접근이 제한된 변수와 같이 사용 
		b.setMoney(1000);
		
		
		System.out.println("현금:" + b.getMoney());
	}
}
