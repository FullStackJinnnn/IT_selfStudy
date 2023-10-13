
public class StudentMain {

	public static void main(String[] args) {
		
		Student st01 = new Student();  //타입은 student로 같지만 둘은 새공간에 만든 다른 학생이다
		Student st02 = new Student();
		
		st01.myName = "홍길동";
		st02.myName = "고길동";
		Student.school = "강남고등학교";
		st01.schoolInfo();
		System.out.println("나의 학교는"+ st01.school);
		//노란줄 그어져 있음. schooL은 인스턴스 호출이 아니라 클래스로 선언
		//자바도 경고를 내보냄 인스턴스도 출력 가능하지만 클래스로 호출하는게 맞다.
		System.out.println("나의 학교는"+ Student.school);
		st02.schoolInfo();
		 
		//static은 메모리위치에 항상존재 메모리 점유 조심해야한다. 공유용으로도 사용 프로그램이 종료 될때까지 안사라짐
		// static은 클래스를 해석할 때 메모리에 등재
		// 그리고 프로그램이 종료 될 떄 해제
		// 프고르매이 진행 중일 때는 메모리에 고정
		// 메모리 점유!
		// 자주사용하는 변수, 자주사용하는 메서드에 사용 
		
		// Arrays.toString() 클래스명 Array에 바로 toString() 메서드 사용
		// Arrays.sort()
		// System.out.println() out -> static / println -> 가지고있는 기능  
		
		// 메모리에 쓰고지우는 너무 빈번한 사용은 찌꺼기가 남을 수 있다.
		// 
		
	}

}
