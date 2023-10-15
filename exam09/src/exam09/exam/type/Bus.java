package exam09.exam.type;

public class Bus extends car{
	public Bus(String myName) {
		super(myName);
	}
	
	public void getInfo() {
		System.out.println("버스 이름은" + this.getmyName() + "입니다");
	
	}
}
