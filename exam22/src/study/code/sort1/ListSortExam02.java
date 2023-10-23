package study.code.sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortExam02 {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		//랜덤 클래스 선언1
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			//nextInt(값); 0<= x < 값 +1 --> 1 <= x < 50
			list.add(rand.nextInt(50) + 1); //random메서드보다 편하다
		}
		
		System.out.println("정렬 전" + list);
		
		//collection 을 이용한 정렬기능
		Collections.sort(list);
		
		
		System.out.println("오름차순 정렬 후" + list);
		
		Collections.sort(list, Comparator.reverseOrder()); // 배열에서 사용했던것처럼 comparator를 이용해 내림차순으로
		//정렬할 수 있다.
		
		System.out.println("내림차순 정렬 후" + list);
		
	}
}
