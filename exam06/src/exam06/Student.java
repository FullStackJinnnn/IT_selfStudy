package exam06;

public class Student {

	private int age;
	private String myName;
	private String school;
	
	//기본생성자
	public Student() {
		
	}
	
	//생성자를 통해서 데이터를 받고싶을때 
	public Student(int age, String myName) {
		this.myName = myName;
		this.age = age;
	}
	
	
	//오버로드
	public Student(int age, String myName, String school) {
		this(age,myName); //같은 이름을 가진 오버로딩 생성자가 있으면 
		// this를 통해 오버로딩된 생성자를호출해서 매개변수를 선언해줄 수 있다.
		this.school = school;
	}

	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
}
