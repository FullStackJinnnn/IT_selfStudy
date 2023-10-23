package study.code.sort2;

//학생 객체에 comparable이라는 인터페이스를 상속 
public class Student2 {
	//제네릭을 주는이유 : 이클래스가 비교해야하는 대상을 외부로부터 제네릭을 통해서 입력받는다.
	//하나가아닌 여러개를 받는 인터페이스를 선언하는 것이기 때문.
	//이 클래스에 대해 정렬할 수 있는 방법 2가지.
	//1. 클래스 내에서 정렬 기능 추가하는 방법.
	//2. 외부에서 정렬 옵션을 가지는 외부 클래스를 만드는 방법.
	private String name;
	private int score;
	
	public Student2 (String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//파라미터는 해당 클래스 뒤의 값.
	//compareTo라는 메서드 구현 오름차순 내림차순 제어가능
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("이름 : " + this.getName());
		sb.append(", 정수 : " + this.getScore());
		return sb.toString();
	}
	
	
}
