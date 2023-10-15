package exam07_project;

import java.util.Scanner;

public class StdService {

	private Student[] stdArray; //학생을 담을 수 잇는 배열 선언
	
	
	// 생성자를 통한 초기화
	public StdService() {
		this.stdArray = new Student[3];
		
	}
	
	//학생을 생성하는 메서드
	public void createStudent() {
		Scanner scan = new Scanner(System.in); // 파리미터를 받는 스캐너 객체 생성 
		
		System.out.println("학생을 생성합니다.");
		for(int i = 0 ; i < stdArray.length ; i++) {
			
			
			System.out.println((i+1) + " 번째 학생 이름 :");
			String myName = scan.next();
			System.out.println((i+1) + " 번째 학생 국어점수 :");
			int kor = scan.nextInt();
			System.out.println((i+1) + " 번째 학생 영어점수 :");
			int eng = scan.nextInt();
			System.out.println((i+1) + " 번째 학생 수학점수 :");
			int math = scan.nextInt();
			
			//학생 객체르 생성
			Student st = new Student(myName, kor, eng, math);
			//배열에 저장
			
			stdArray[i] = st;
			
			}
			
	
		System.out.println("학생 생성 완료~");
		scan.close();
	}
	
	//학생정보를 출력합니다. ==> 성적이 좋은순서로~
	public void printStudent() {
		Student temp = null; // 0과 null 은 다르다 null 은 공간이 비어있음.
		//버블정렬 
		for (int i=stdArray.length; i>0; i--) {
			for(int j =0; j <(i-1);j ++) { //마지막 까지가면 비교할게 없다 
				//내림차순 정렬 ~
				//Student st = stdArray[i];
				//st.getTotal() 과 같다.
				if(stdArray[j].getTotal() < stdArray[j+1].getTotal()) {
					temp = stdArray[j+1];
					stdArray[j+1] = stdArray[j];
					stdArray[j] = temp;
				}
			}
		}
		
		//출력 
		for (int i=0; i < stdArray.length; i++) {
			Student st = stdArray[i];
			System.out.print("이름 :  " + st.getMyName()+ ", ");
			System.out.print("국어 :  " + st.getKor()+ ", ");
			System.out.print("영어 :  " + st.getEng()+ ", ");
			System.out.print("수학 :  " + st.getMath()+ ", ");
			System.out.print("총점 :  " + st.getTotal()+ ", ");
			System.out.print("평균 :  " + st.getAvg()+ "\n");
		}
	}
	
}
