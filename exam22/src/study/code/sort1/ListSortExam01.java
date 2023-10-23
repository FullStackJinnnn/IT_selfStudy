package study.code.sort1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListSortExam01 {
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		//랜덤 클래스 선언1
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			//nextInt(값); 0<= x < 값 +1 --> 1 <= x < 50
			list.add(rand.nextInt(50) + 1); //random메서드보다 편하다
		}
		
		System.out.println("정렬 전" + list);
		int temp =0;
		//버블정렬 마지막 1개 빼고 돌아야한다 다음것과 비교할게 없기 때문
		for(int i = (list.size()-1) ; i>0 ; i--) {
			for(int j=0; j<i; j++) {
				if(list.get(j) < list.get(j+1)) {
					temp = list.get(j+1);
					list.set(j+1, list.get(j));
					list.set(j,  temp);
				}
			}
			
		}
		System.out.println("정렬 후" + list);
		
	}
}
