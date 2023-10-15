package exam09.exam.type;

public class Taxi extends Bus {

	public Taxi(String myName) {
		super(myName);
	}
	
	public void getInfo() {
		System.out.println("택시 이름은" + this.getmyName() + "입니다");
		}
	
}
