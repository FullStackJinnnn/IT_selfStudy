package exam07_project;

import java.math.BigDecimal;
import java.math.RoundingMode; //java.util << 패키지 Scanner << 클래스
//기본적으로 제공되지 않기 때문에 import 해줘야함.
//패키지란!!!!!!!!!!!
//패키지가 달라지면 동명의 클래스가 생길 수 있다.
//패키지는 폴더같은 개념!
//같은폴더에 넣어놓는 느낌 
//패키지는 목적별로 정리리를 도와주는것!
//ex 유틸, 언어, math, ui등등 목적에따라 패키지를 나눠 클래스 관리!

public class Student {

	private String myName;
	private int kor;
	private int eng;
	private int math;
	
	//파라미터가 있는 생성자 생성.
	public Student(String myName, int kor, int eng, int math) {
		this.myName = myName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	


	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	//총점 구하는 메서드
	public int getTotal() {
		return (this.kor + this.eng + this.math);
	}
	
	//평균 구하는 메서드;
	//BigDeciaml 클래스 -> 숫자, 소수점처리관련 메서드 
	//ex 3.41 -> 3.4100000으로 나오는걸 잡아준다.
	
	public double getAvg() {
		double avg = (double)this.getTotal() /3;
		BigDecimal dec = new BigDecimal(avg); //BigDecimal 은 모든 숫자 타입으로 데이터 리턴 가능
		return dec.setScale(2, RoundingMode.HALF_UP).doubleValue(); //setScale(자리수, 옵션)
		//옵셥은 반올림, 내림,올림 
		//옵션은 스테틱 변수로 되어있음 객체화 하지않고 불러옰 수있다.
		//setScale 은 리턴타입이 객체 
	}
}
	