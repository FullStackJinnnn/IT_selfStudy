package exam09.exam.manytype;

public class CompMain {

	public static void main(String[] args) {
		
		ComputerRoom room = new ComputerRoom();
		
		//LZcom com = new LZcom();
		//오른쪽에 있는 bew LZcom() 자체가 값이 될 수 있다. 
		room.setCom1(new LZcom());
		room.setCom2(new SamsongCom());
		
		room.allPowerOn();
		room.allPowerOff();
		
		
		//부모 타입으로 변환되어 저장된 변수는 안에 어떤 객체가 담겨있는지 직접 확인하지 않으면 내부객체를
		//알기가 쉽지않다.
		//이때 사용하는것이 instanceof
		// A instance of B
		// A 는 B객체를 참조하고 있는가 ? 
		// 참이면 True 아니면 False 를 리턴 
	}

}
