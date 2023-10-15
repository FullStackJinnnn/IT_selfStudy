package exam09.exam.type;

public class TypeTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bus b = new Bus("버스");
		Taxi t1 = new Taxi("택시");
		//형변환
		car car = t1; // t1을 car 타입으로 바꿈 부모타입으로 변경하면 부모타입은 자식의 기능을 사용 못한다.
		
		b.getInfo();
		t1.getInfo();
		
		//부모타입으로 형변환되면 자식클래스가 가진 기능이나 속성을 사용할 수없다.
		//클래스 타입형변환은 잘 안한다.
		//car.getInfo(); 
		
		//클래스 형변환
		//1. 형변환  강제, 자동 가능!
		//2. 상속관계가 있을 떄 가능
		//3. 1차상속이 아니어도 가능
		//4. 자식->부모 형변환만가능
		//5. 부모타입으로 변경할경우 class인경우에 자식의 속성이나 기능 사용 불가.
		
		//강제형변환
		
		Taxi t2 = (Taxi)car;
		
		t2.getInfo();
	}

}
