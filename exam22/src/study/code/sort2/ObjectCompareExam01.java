package study.code.sort2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectCompareExam01 {
	
	public static void main(String[] args) {
		
	Student1 st01 = new Student1("김철수" ,260);
	Student1 st02 = new Student1("김영희" ,290);
	Student1 st03 = new Student1("김대리" ,280);
	
	List<Student1> list = new ArrayList<>();
	list.add(st01);
	list.add(st02);
	list.add(st03);
	
	System.out.println("정렬 전 : " );
	for (Student1 st : list) {
		System.out.println(st);
	}
	
	Collections.sort(list);
	
	//학생객체에 점수를 내림차순으로 정렬했다.
	System.out.println("정렬 후 : ");
	for (Student1 st : list) {
		System.out.println(st);
	}
	}
	
}
