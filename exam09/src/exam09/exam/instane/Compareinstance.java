package exam09.exam.instane;

import exam09.exam.manytype.Computer;
import exam09.exam.manytype.LZcom;
import exam09.exam.manytype.SamsongCom;

public class Compareinstance {

	public static void getMyType(Computer com) {
		// 상속을 이용했을때 어떤 객체를 갖고있나 확인할때 instanceof 사용 
		if(com instanceof SamsongCom) {
			System.out.println("상송컴");
		}else if(com instanceof LZcom) {
			System.out.println("LZ 컴");
		}else {
			System.out.println("누구세요");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체는 부모타입으로 선언했지만
		//실제 구현한것은 자식이기 떄문에 각자의 타입이 나온다.
		SamsongCom sam = new SamsongCom();
		LZcom lz = new LZcom();
		
		Compareinstance.getMyType(sam);
		Compareinstance.getMyType(lz);
		
		
	}

}
