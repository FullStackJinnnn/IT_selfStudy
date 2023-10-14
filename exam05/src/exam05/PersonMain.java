package exam05;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p01 = new Person(); // <-- Person() 은 생성자이고 따로 만들어주지 않았지만 컴퓨터가 알아서 만들어서 사용할 수 있는 것이다.
		
		p01.setMyName("홍길동");
		p01.setAge(300);
		
		System.out.println("나는 " + p01.getMyName() + "나의나이" + p01.getAge()+"살이다");		
		
	}

}
