package exam05;

public class Person {

	
	private int age;
	private String myName;
	
	//마우스 우크릭해서 generate setter,getter로 만들기 가능 
	
	//우클릭 -> source -> Generate getter, setter 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("잘못입력");
			return;
		}
		this.age = age;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
}
