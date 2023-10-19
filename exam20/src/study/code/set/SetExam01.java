package study.code.set;

import java.util.HashSet;
import java.util.Set;

public class SetExam01 {
	public static void main(String[] args) {
	
		
		//set을 선언
		Set<Integer> set = new HashSet();
		
		//추가
		
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		set.add(1);
		
		set.add(2);
		set.add(2);
		
		set.add(3);
		set.add(4);
		set.add(4);
		//set은 중복이 안된다.
		System.out.println(set);
		
		
		set.remove(3);
		System.out.println(set);
		//clear는 객체의형태는 남겨두고 내용(데이트)만 삭제한다.
		//set.clear();
		
	
		System.out.println("set의 크기 : " + set.size());
		System.out.println("set 안에 3 데이터 존재?   :"+ set.contains(3));
		
		
		
	}

}
