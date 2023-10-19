package exam.codedoc;

/**
 * 학생 정보를 담는 클래스이다.
 * 
 * @author javaStudy
 * 
 * 
 */
public class Student {
/**
 * 학생 이름
 */
	private String myName;
	/**
	 *학생 나이 
	*/
	private int age;
	/**
	 * 학생 이름을 변환하는 메서드
	 * @return myname
	 * 
	 */
	public String getMyName() {
		return myName;
	}
	
	/**
	 * 학생 이름을 등록하는 메서드
	 * @param myName
	 */
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
