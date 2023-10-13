package exam05;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p01 = new Person();
		
		p01.setMyName("홍길동");
		p01.setAge(300);
		
		System.out.println("나는 " + p01.getMyName() + "나의나이" + p01.getAge()+"살이다");		
		
	}

}
