package exam06;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(); //-> 이경우 개발자가 생성자를 어떤거든 만들면 시스템이 자동으로 만들어주지 않는다.
		// 즉 아무것도 개발자가 직접 만들지 않아야 시스템이 생성을 해서 선언이 가능해진다.
		Student st2 = new Student(17, "태명", "송도고등학교"); //생성자를 통해 데이터 주입 가능
		
		st1.setAge(18);
		st1.setMyName("개구리");
		st1.setSchool("죽전고");
		
		System.out.println("이름: " + st1.getMyName() + "나이" + st1.getAge()+ "학교" + st1.getSchool());
		System.out.println("이름: " + st2.getMyName() + "나이" + st2.getAge()+ "학교" + st2.getSchool());
	}
}
