package study.code.sort2;

import java.util.Comparator;

//compare객체가 다르다 comparable , comparator
public class StdDescCompare implements Comparator<Student2>{

	@Override //전과 후의 파라미터를 다준다. 외부클래스이기 때문에 
	public int compare(Student2 obj1, Student2 obj2) {
		// TODO Auto-generated method stub
		return obj1.getScore() < obj2.getScore() ? 1 : -1 ;
	}

	
}