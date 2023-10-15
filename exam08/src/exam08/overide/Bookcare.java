package exam08.overide;

import exam08.upper.Book;
import exam08.upper.ComicBook;

public class Bookcare {
	public static void main(String[] args) {
		//접근제한자 4가지
		//public 제한없이 모든 클래스,패키지 접근가능
		//protected 같은패키지안에서 접근가능, 다른패키지라도 자식클래스면 접근가능
		//defualt 같은 패키지 내에서만 접근 가능
		//private 같은 클래스 내에서만 접근 가능 
		
	ComicBook b = new ComicBook("ts",30000); // 폴더가 다르기 떄문에? import 해야함
		
		// default 제한의 경우 같은 패키지 내의 클래스까지만 접근 가능
		// BookCare 는 다른패키지의 클래스라서 접근 불가
		//b.title = "33";
	
	
		//부모가 자식에게 물려주는것들
		//기능,속성, 타입 -> 유전자 
		//자바는 다형성이란 특징을 가지굈는것이 있다.
		//다향한 형태의 성질....
		//상속을 통해서 가질 수 있다.
		//N차상속 가능 부모 expends 조상
		//조상 expends 조상 2
		//모든걸 물려봤는다. 
	
		//final -> 변수, 클래스, 메서드에 모두 붙일 수 있다.
		//final int a = 3; 이라고 선언 한 이후에
		//a=4; 는 할수없다 final은 고정 및 마지막 
		//선언시에 초기값을 부여해야한다 .
		//지역 final 변수의 경우, 선언과 동시에 값 초기화를 할 필요 없다.
		//메서드의 final을 붙일경우 오버라이드 불가
		//객체 (클래스)에 final 붙이면 상속을 시킬 수 없다 -> 이 객체가 부모클래스가 될 수 없다.
	
	}
}
