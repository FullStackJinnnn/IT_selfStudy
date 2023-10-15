// 상속!
//부모 클래스가 자식 클래스에 맴버와 메서드를 물려주는 것을 의미
//상속은 클래스를 재사용함으로써 중복을줄이고, 수정을 최소화
//extends (확장) 사용! 
// class A{} 부모
// class B{} 자식일떄

//class B extends A 자식을 확장 !!!!!!!!!
//B + A
package exam08.upper;

public class Book2 {
	String title;
	int price;
	
	//ㅂ파라ㅣ터가 필요한 생성자
	public Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void info() {
		System.out.println("책의 제목" + this.title + "책의 가격" + this.price);
	}
	
}
