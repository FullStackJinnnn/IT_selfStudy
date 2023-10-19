package exam18;
//WrapperClass
public class WrapperTest01 {

	public static void main(String[] args) {
		
		Integer num01 =10; //오토 박싱
//		integer num02 = new Integer(10); 이제 쓰면 안됨
		Integer num03 = Integer.valueOf(10);
		Integer num04 = Integer.valueOf("10"); // 문자타입 숫자를 정수로 바꿀 수 있음. 소수는 안되고 정수만가능.
		
		Double dnum01 = 10.11;
		Double dnum02 = Double.valueOf("10.11");
		Double dnum03 = Double.valueOf(10.11);
		//toString 을 오버라이드해서 출력함 ..? 
		System.out.println("출력 : " + dnum02);
		System.out.println("출력 : " + num03);
	
		
		//모든 wrapper 클래스는 
		//Parse...을 가지고있다.
		//Parse Int() Parse long() Parse Double()
	}
}
