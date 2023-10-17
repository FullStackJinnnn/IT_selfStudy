package exam12.local.cls;

public class Unit {
	//메서드 내부 클래스는 부여된 객체만 사용가능한 장점이 있다 ...
	private int speed = 10;
	
	public void getunit(String type, String unitname) {
		//지역 클래스에서 메서드 내의 변수를 사용하려면 해당변수는 final 이어야한다.
		//자바에서 지역 메서드를 사용할때 파라미터 변수를 바꾸지 않는다면 자동으로 final로 인정
		//unitname = unitname + "님"	; 을 하면 final이 아니게 된다. 
		class Tank{
			public void move() {
				System.out.println(unitname +"이" + speed +"속도로 이동");
			}
		}
		
		class Ship{
			public void move() {
				System.out.println(unitname +"이" + speed +"속도로 이동");
			}
		}
		Tank t =null; //Object란 객체의 최상위
		Ship s =null;
		if(type.equals("ship")) {
			s = new Ship();
			s.move();
		}else if(type.equals("Tank")) {
			t = new Tank();
			t.move();
		}
		
	//지역 클래스에서 메서드 내의 변수를 사용하려면 해당변수는 final 이어야한다.
	


	}
	
	
}
